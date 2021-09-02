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
import java.net.ServerSocket;
import java.net.Socket;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerClass {
    public static boolean sentIntegers = false;
    private boolean cancelSendingThread = false;
    private String correct_ans;
    /* access modifiers changed from: private */
    public ObjectInputStream ois;
    /* access modifiers changed from: private */
    public boolean ok = false;
    /* access modifiers changed from: private */
    public ObjectOutputStream oos;
    private String player_opt;
    private int progressLevel;
    /* access modifiers changed from: private */
    public int receivePort;
    /* access modifiers changed from: private */
    public Socket receive_socket;
    public boolean received = false;
    /* access modifiers changed from: private */
    public ServerSocket receivingServer;
    /* access modifiers changed from: private */
    public int sendPort;
    /* access modifiers changed from: private */
    public Socket send_socket;
    /* access modifiers changed from: private */
    public ServerSocket sendingServer;
    /* access modifiers changed from: private */
    public boolean stop = true;
    /* access modifiers changed from: private */
    public boolean stopSend = true;

    public ServerClass(int receivePort2, int sendPort2) {
        this.receivePort = receivePort2;
        this.sendPort = sendPort2;
        this.received = false;
        new ServerListeningClass().execute(new Void[0]);
        startSending();
        sendOk();
    }

    /* access modifiers changed from: private */
    public void sendOk() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (ServerClass.this.ok) {
                    ServerClass.this.sendData("OK");
                } else {
                    ServerClass.this.sendOk();
                }
            }
        }, 1);
    }

    private void startSending() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServerSocket unused = ServerClass.this.sendingServer = new ServerSocket(ServerClass.this.sendPort);
                    while (ServerClass.this.stopSend) {
                        Log.d("Multiplayer", "New server sending!");
                        Socket unused2 = ServerClass.this.send_socket = ServerClass.this.sendingServer.accept();
                        if (!ServerClass.this.ok) {
                            boolean unused3 = ServerClass.this.ok = true;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void sendData(final String message) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    ObjectOutputStream unused = ServerClass.this.oos = new ObjectOutputStream(ServerClass.this.send_socket.getOutputStream());
                    ServerClass.this.oos.writeObject(message);
                    ServerClass.this.oos.flush();
                    ServerClass.this.oos.close();
                    ServerClass.this.send_socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void closeSending() {
        try {
            this.send_socket.close();
            this.sendingServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ServerListeningClass extends AsyncTask<Void, String, Void> {
        private ServerListeningClass() {
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... params) {
            try {
                ServerSocket unused = ServerClass.this.receivingServer = new ServerSocket(ServerClass.this.receivePort);
                while (ServerClass.this.stop) {
                    Log.d("Multiplayer", "New server Listening!");
                    Socket unused2 = ServerClass.this.receive_socket = ServerClass.this.receivingServer.accept();
                    ObjectInputStream unused3 = ServerClass.this.ois = new ObjectInputStream(ServerClass.this.receive_socket.getInputStream());
                    ServerClass.this.ois.close();
                    ServerClass.this.receive_socket.close();
                    publishProgress(new String[]{(String) ServerClass.this.ois.readObject()});
                }
                return null;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
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
                ServerClass.this.parseMessage(values[0]);
            }
            ServerClass.this.received = true;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            try {
                ServerClass.this.ois.close();
                ServerClass.this.receive_socket.close();
                ServerClass.this.receivingServer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void cancelThread() {
        this.cancelSendingThread = true;
        new ServerListeningClass().cancel(true);
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

    public static void sendJsonInt(final String jsonInt) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServerSocket jsonServer = new ServerSocket(AppConstants.PORT);
                    Socket jsonSocket = jsonServer.accept();
                    ObjectOutputStream oos = new ObjectOutputStream(jsonSocket.getOutputStream());
                    oos.writeObject(jsonInt);
                    ObjectInputStream ois = new ObjectInputStream(jsonSocket.getInputStream());
                    if (((String) ois.readObject()).equals("OK")) {
                        ServerClass.sentIntegers = true;
                    }
                    oos.flush();
                    oos.close();
                    ois.close();
                    jsonSocket.close();
                    jsonServer.close();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
