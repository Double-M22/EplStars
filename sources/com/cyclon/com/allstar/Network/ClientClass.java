package com.cyclon.com.allstar.Network;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Global.GlobalVariables;
import com.cyclon.com.allstar.MultiPlayer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ClientClass {
    public static boolean receivedIntegers = false;
    private String correct_ans;
    /* access modifiers changed from: private */
    public String ipAddress;
    /* access modifiers changed from: private */
    public Handler lagHandler = new Handler();
    /* access modifiers changed from: private */
    public String message = null;
    /* access modifiers changed from: private */
    public ObjectInputStream ois;
    /* access modifiers changed from: private */
    public ObjectOutputStream oos;
    private String player_opt;
    private int progressLevel;
    /* access modifiers changed from: private */
    public int receivePort;
    /* access modifiers changed from: private */
    public Socket receive_socket;
    public boolean received;
    /* access modifiers changed from: private */
    public int sendPort;
    /* access modifiers changed from: private */
    public Socket send_socket;
    /* access modifiers changed from: private */
    public boolean stop = true;

    public ClientClass(String ip, int receivePort2, int sendPort2) {
        this.ipAddress = ip;
        this.receivePort = receivePort2;
        this.sendPort = sendPort2;
        this.received = false;
        new ClientListeningClass().execute(new Void[0]);
        sendData("OK");
    }

    public void sendData(final String message2) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Socket unused = ClientClass.this.send_socket = new Socket(ClientClass.this.ipAddress, ClientClass.this.sendPort);
                    ObjectOutputStream unused2 = ClientClass.this.oos = new ObjectOutputStream(ClientClass.this.send_socket.getOutputStream());
                    ClientClass.this.oos.writeObject(message2);
                    ClientClass.this.oos.flush();
                    ClientClass.this.oos.close();
                    ClientClass.this.send_socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private class ClientListeningClass extends AsyncTask<Void, String, Void> {
        private ClientListeningClass() {
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... params) {
            while (ClientClass.this.stop) {
                try {
                    Log.d("Multiplayer", "New client Listening!");
                    Socket unused = ClientClass.this.receive_socket = new Socket(ClientClass.this.ipAddress, ClientClass.this.receivePort);
                    ObjectInputStream unused2 = ClientClass.this.ois = new ObjectInputStream(ClientClass.this.receive_socket.getInputStream());
                    String unused3 = ClientClass.this.message = (String) ClientClass.this.ois.readObject();
                    ClientClass.this.ois.close();
                    ClientClass.this.receive_socket.close();
                    ClientClass.this.lagHandler.postDelayed(new Runnable() {
                        public void run() {
                            ClientListeningClass clientListeningClass = ClientListeningClass.this;
                            clientListeningClass.publishProgress(new String[]{ClientClass.this.message});
                        }
                    }, 1000);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(String... values) {
            if (values[0].contains("RPG")) {
                int progress = Integer.parseInt(values[0].substring(3));
                GlobalVariables.progress = progress;
                MultiPlayer.cancelSideProgress = true;
                MultiPlayer.progressRight.setProgress(progress);
                MultiPlayer.progressTop.setSecondaryProgress(progress);
                return;
            }
            if (!values[0].equals("OK")) {
                ClientClass.this.parseMessage(values[0]);
            }
            ClientClass.this.received = true;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            try {
                ClientClass.this.ois.close();
                ClientClass.this.receive_socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void cancelThread() {
        new ClientListeningClass().cancel(true);
    }

    /* access modifiers changed from: private */
    public void parseMessage(String dataToParse) {
        try {
            JSONObject jsonObject = new JSONObject(dataToParse);
            this.player_opt = jsonObject.getString(AppConstants.PLAYER_OPT);
            this.correct_ans = jsonObject.getString(AppConstants.CORRECT_ANS);
            this.progressLevel = jsonObject.getInt(AppConstants.PROGRESS_BAR_LEVEL);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void receiveJsonInt(final String ip) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Socket jsonSocket = new Socket(ip, AppConstants.PORT);
                    ObjectInputStream ois = new ObjectInputStream(jsonSocket.getInputStream());
                    String jsonArray = (String) ois.readObject();
                    if (jsonArray != null) {
                        ClientClass.parseJsonInt(jsonArray);
                        ObjectOutputStream oos = new ObjectOutputStream(jsonSocket.getOutputStream());
                        oos.writeObject("OK");
                        oos.flush();
                        oos.close();
                    }
                    ois.close();
                    jsonSocket.close();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public static void parseJsonInt(String jsonArray) {
        List<Integer> list = new ArrayList<>();
        try {
            JSONArray jar = new JSONObject(jsonArray).getJSONArray("Integers");
            for (int i = 0; i < jar.length(); i++) {
                list.add(Integer.valueOf(Integer.parseInt(jar.getString(i))));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MultiPlayer.integers = list;
        receivedIntegers = true;
    }
}
