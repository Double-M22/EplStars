package com.cyclon.com.allstar;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Data.Data;
import com.cyclon.com.allstar.Global.GlobalVariables;
import com.cyclon.com.allstar.Network.ClientClass;
import com.cyclon.com.allstar.Network.ServerClass;
import com.cyclon.com.allstar.RandomGenerator.GenerateRandom;
import com.cyclon.com.allstar.Service.WifiDirectBroadcastReceiver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MultiPlayer extends AppCompatActivity {
    public static String[] ans = new String[150];
    public static boolean cancelSideProgress = false;
    public static List<Integer> integers = new ArrayList();
    public static ProgressBar progressLeft;
    public static ProgressBar progressRight;
    public static ProgressBar progressTop;
    public static String[][] question = ((String[][]) Array.newInstance(String.class, new int[]{150, 5}));
    /* access modifiers changed from: private */
    public String answer;
    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(AppConstants.ACTION_CLOSE_ACTIVITY)) {
                GlobalVariables.isMultiplayer = false;
                MultiPlayer.this.startActivity(new Intent(MultiPlayer.this, MyWifiConnection.class));
                MultiPlayer.this.finish();
            }
        }
    };
    private MediaPlayer btn_clicked;
    boolean cancelProgress = false;
    /* access modifiers changed from: private */
    public ClientClass clientClass;
    /* access modifiers changed from: private */
    public MediaPlayer d_hat_trick;
    /* access modifiers changed from: private */
    public String hostIP;
    private int i = 0;
    /* access modifiers changed from: private */
    public boolean isHost;
    private RelativeLayout layout;
    private LinearLayout loading;
    LocalBroadcastManager localBroadcastManager;
    /* access modifiers changed from: private */
    public Handler myHandler = new Handler();
    /* access modifiers changed from: private */
    public Button opt_1;
    /* access modifiers changed from: private */
    public Button opt_2;
    /* access modifiers changed from: private */
    public Button opt_3;
    /* access modifiers changed from: private */
    public Button opt_4;
    /* access modifiers changed from: private */
    public int p_level;
    private List<Data> players = new ArrayList();
    /* access modifiers changed from: private */
    public int progressStatus = 100;
    private Thread progressThread;
    private TextView qst;
    /* access modifiers changed from: private */
    public MediaPlayer right;
    /* access modifiers changed from: private */
    public int right_count;
    /* access modifiers changed from: private */
    public ServerClass serverClass;
    private View shade;
    int sidePStatus = 100;
    Handler sideProgressHandler = new Handler();
    /* access modifiers changed from: private */
    public Handler wait = new Handler();
    private MediaPlayer wrong;

    static /* synthetic */ int access$1710(MultiPlayer x0) {
        int i2 = x0.progressStatus;
        x0.progressStatus = i2 - 1;
        return i2;
    }

    static /* synthetic */ int access$608(MultiPlayer x0) {
        int i2 = x0.right_count;
        x0.right_count = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_multi_player);
        GlobalVariables.isMultiplayer = true;
        this.localBroadcastManager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AppConstants.ACTION_CLOSE_ACTIVITY);
        this.localBroadcastManager.registerReceiver(this.broadcastReceiver, intentFilter);
        this.shade = findViewById(R.id.multi_shade);
        this.loading = (LinearLayout) findViewById(R.id.multi_shade_loading);
        this.layout = (RelativeLayout) findViewById(R.id.multi_layout);
        progressRight = (ProgressBar) findViewById(R.id.multi_progress_right);
        progressLeft = (ProgressBar) findViewById(R.id.multi_progress_left);
        progressTop = (ProgressBar) findViewById(R.id.multi_top_bar);
        this.qst = (TextView) findViewById(R.id.multiQst);
        this.opt_1 = (Button) findViewById(R.id.multiOpt_1);
        this.opt_2 = (Button) findViewById(R.id.multiOpt_2);
        this.opt_3 = (Button) findViewById(R.id.multiOpt_3);
        this.opt_4 = (Button) findViewById(R.id.multiOpt_4);
        this.right = MediaPlayer.create(this, R.raw.correct);
        this.wrong = MediaPlayer.create(this, R.raw.wrong);
        this.btn_clicked = MediaPlayer.create(this, R.raw.btn_clicked);
        this.d_hat_trick = MediaPlayer.create(this, R.raw.d_hat_trick);
        this.right_count = 0;
        Intent intent = getIntent();
        this.isHost = intent.getBooleanExtra("IsHost", false);
        this.hostIP = intent.getStringExtra("HostAddress");
        this.players = HomePage.mergeTeams(1, 20);
        disable();
        if (this.isHost) {
            ServerClass.sendJsonInt(createJsonIntegerList());
            checkIfReceived();
        } else {
            ClientClass.receiveJsonInt(this.hostIP);
            checkIfReceived();
        }
        this.opt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MultiPlayer multiPlayer = MultiPlayer.this;
                multiPlayer.btnClicked(multiPlayer.opt_1);
            }
        });
        this.opt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MultiPlayer multiPlayer = MultiPlayer.this;
                multiPlayer.btnClicked(multiPlayer.opt_2);
            }
        });
        this.opt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MultiPlayer multiPlayer = MultiPlayer.this;
                multiPlayer.btnClicked(multiPlayer.opt_3);
            }
        });
        this.opt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MultiPlayer multiPlayer = MultiPlayer.this;
                multiPlayer.btnClicked(multiPlayer.opt_4);
            }
        });
    }

    /* access modifiers changed from: private */
    public void btnClicked(final Button btn) {
        final String jsonString = createJsonObject(btn.getText().toString(), this.answer, this.p_level);
        if (this.isHost) {
            ServerClass serverClass2 = this.serverClass;
            serverClass2.sendData("RPG" + this.p_level);
        } else {
            ClientClass clientClass2 = this.clientClass;
            clientClass2.sendData("RPG" + this.p_level);
        }
        this.btn_clicked.start();
        animateBtn(btn, 200, 1200);
        this.progressThread.interrupt();
        this.opt_1.setClickable(false);
        this.opt_2.setClickable(false);
        this.opt_3.setClickable(false);
        this.opt_4.setClickable(false);
        this.cancelProgress = true;
        btn.setBackgroundResource(R.drawable.button_clicked);
        this.wait.postDelayed(new Runnable() {
            public void run() {
                if (btn.getText().toString().trim().equals(MultiPlayer.this.answer)) {
                    MultiPlayer.access$608(MultiPlayer.this);
                    if (MultiPlayer.this.right_count == 3) {
                        MultiPlayer.this.d_hat_trick.start();
                    } else {
                        MultiPlayer.this.right.start();
                    }
                    btn.setBackgroundResource(R.drawable.button_right);
                    btn.clearAnimation();
                    MultiPlayer.this.animateBtn(btn, 170, 1000);
                } else {
                    btn.setBackgroundResource(R.drawable.button_wrong);
                    MultiPlayer.this.getRightAnswer();
                }
                MultiPlayer.this.wait.postDelayed(new Runnable() {
                    public void run() {
                        if (MultiPlayer.this.isHost) {
                            MultiPlayer.this.serverClass.sendData(jsonString);
                        } else {
                            MultiPlayer.this.clientClass.sendData(jsonString);
                        }
                        MultiPlayer.this.delayHandler();
                    }
                }, 1100);
            }
        }, 1200);
    }

    /* access modifiers changed from: private */
    public void delayHandler() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (MultiPlayer.this.isHost) {
                    if (!MultiPlayer.this.serverClass.received) {
                        MultiPlayer.this.delayHandler();
                        return;
                    }
                    MultiPlayer.this.serverClass.received = false;
                    MultiPlayer.this.getQuestion();
                } else if (!MultiPlayer.this.clientClass.received) {
                    MultiPlayer.this.delayHandler();
                } else {
                    MultiPlayer.this.clientClass.received = false;
                    MultiPlayer.this.getQuestion();
                }
            }
        }, 1);
    }

    /* access modifiers changed from: private */
    public void setQuestion() {
        for (int i2 = 0; i2 < 150; i2++) {
            Data data = this.players.get(integers.get(i2).intValue());
            question[i2][0] = data.getSurname();
            question[i2][1] = data.getOpt_1();
            question[i2][2] = data.getOpt_2();
            question[i2][3] = data.getOpt_3();
            question[i2][4] = data.getOpt_4();
            ans[i2] = data.getAns();
        }
    }

    /* access modifiers changed from: private */
    public void refreshQuestion() {
        final String jsonString = createJsonObject("NULL", this.answer, 0);
        if (this.isHost) {
            this.serverClass.sendData("RPG0");
        } else {
            this.clientClass.sendData("RPG0");
        }
        this.opt_1.setClickable(false);
        this.opt_2.setClickable(false);
        this.opt_3.setClickable(false);
        this.opt_4.setClickable(false);
        getRightAnswer();
        this.wait.postDelayed(new Runnable() {
            public void run() {
                if (!MultiPlayer.this.cancelProgress) {
                    if (MultiPlayer.this.isHost) {
                        MultiPlayer.this.serverClass.sendData(jsonString);
                    } else {
                        MultiPlayer.this.clientClass.sendData(jsonString);
                    }
                    MultiPlayer.this.delayHandler();
                }
            }
        }, 1100);
    }

    /* access modifiers changed from: private */
    public void getRightAnswer() {
        this.wrong.start();
        this.right_count = 0;
        if (this.opt_1.getText().toString().equals(this.answer)) {
            this.opt_1.setBackgroundResource(R.drawable.button_right);
            animateBtn(this.opt_1, 150, 1000);
        } else if (this.opt_2.getText().toString().equals(this.answer)) {
            this.opt_2.setBackgroundResource(R.drawable.button_right);
            animateBtn(this.opt_2, 150, 1000);
        } else if (this.opt_3.getText().toString().equals(this.answer)) {
            this.opt_3.setBackgroundResource(R.drawable.button_right);
            animateBtn(this.opt_3, 150, 1000);
        } else if (this.opt_4.getText().toString().equals(this.answer)) {
            this.opt_4.setBackgroundResource(R.drawable.button_right);
            animateBtn(this.opt_4, 150, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void getQuestion() {
        if (this.i == 150) {
            showDialog();
            this.progressThread.interrupt();
            this.cancelProgress = true;
        }
        this.progressStatus = 100;
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (MultiPlayer.this.progressStatus > 0) {
                    if (MultiPlayer.this.cancelProgress) {
                        MultiPlayer.this.cancelProgress = false;
                        return;
                    }
                    MultiPlayer.access$1710(MultiPlayer.this);
                    MultiPlayer multiPlayer = MultiPlayer.this;
                    int unused = multiPlayer.p_level = multiPlayer.progressStatus;
                    MultiPlayer.this.myHandler.post(new Runnable() {
                        public void run() {
                            if (MultiPlayer.this.progressStatus == 0) {
                                MultiPlayer.this.refreshQuestion();
                            }
                            MultiPlayer.progressTop.setProgress(MultiPlayer.this.progressStatus);
                            MultiPlayer.progressLeft.setProgress(MultiPlayer.this.progressStatus);
                            int unused = MultiPlayer.this.p_level = MultiPlayer.this.progressStatus;
                        }
                    });
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        this.progressThread = thread;
        thread.start();
        startSideProgressBars();
        ArrayList<String> options = new ArrayList<>();
        for (Integer intValue : GenerateRandom.getRandomArrangement(4)) {
            int j = intValue.intValue();
            if (j == 0) {
                options.add(question[this.i][1]);
            } else if (j == 1) {
                options.add(question[this.i][2]);
            } else if (j == 2) {
                options.add(question[this.i][3]);
            } else if (j == 3) {
                options.add(question[this.i][4]);
            }
        }
        this.opt_1.setClickable(true);
        this.opt_2.setClickable(true);
        this.opt_3.setClickable(true);
        this.opt_4.setClickable(true);
        this.opt_1.setBackgroundResource(R.drawable.button);
        this.opt_2.setBackgroundResource(R.drawable.button);
        this.opt_3.setBackgroundResource(R.drawable.button);
        this.opt_4.setBackgroundResource(R.drawable.button);
        this.qst.setText(question[this.i][0]);
        this.opt_1.setText(options.get(0));
        this.opt_2.setText(options.get(1));
        this.opt_3.setText(options.get(2));
        this.opt_4.setText(options.get(3));
        String[] strArr = ans;
        int i2 = this.i;
        this.answer = strArr[i2];
        this.i = i2 + 1;
    }

    /* access modifiers changed from: private */
    public void animateBtn(final Button btn, int speed, int duration) {
        AlphaAnimation btn_anim = new AlphaAnimation(1.0f, 0.0f);
        btn_anim.setDuration((long) speed);
        btn_anim.setInterpolator(new LinearInterpolator());
        btn_anim.setRepeatCount(-1);
        btn_anim.setRepeatMode(2);
        btn.startAnimation(btn_anim);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                btn.clearAnimation();
            }
        }, (long) duration);
    }

    private void startSideProgressBars() {
        if (this.i == 150) {
            showDialog();
            this.progressThread.interrupt();
            cancelSideProgress = true;
        }
        this.sidePStatus = 101;
        new Thread(new Runnable() {
            public void run() {
                while (MultiPlayer.this.sidePStatus > 0) {
                    if (GlobalVariables.progress == 0) {
                        MultiPlayer.cancelSideProgress = false;
                        GlobalVariables.progress = 1;
                    }
                    if (MultiPlayer.cancelSideProgress) {
                        MultiPlayer.cancelSideProgress = false;
                        return;
                    }
                    MultiPlayer.this.sidePStatus--;
                    MultiPlayer.this.sideProgressHandler.post(new Runnable() {
                        public void run() {
                            MultiPlayer.progressRight.setProgress(MultiPlayer.this.sidePStatus);
                        }
                    });
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void showDialog() {
        if (this.isHost) {
            this.serverClass.cancelThread();
        } else {
            this.clientClass.cancelThread();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("You Won!!!");
        builder.setCancelable(false);
        builder.setPositiveButton("Return Home", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                WifiDirectBroadcastReceiver.disconnect();
                MultiPlayer.this.startActivity(new Intent(MultiPlayer.this, HomePage.class));
                MultiPlayer.this.finish();
            }
        });
        builder.setNegativeButton("Play Again", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = MultiPlayer.this.getIntent();
                intent.setFlags(65536);
                MultiPlayer.this.finish();
                MultiPlayer.this.startActivity(intent);
                dialog.cancel();
            }
        });
        builder.create().show();
    }

    private String createJsonObject(String selection, String rAns, int progressLevel) {
        return "{Correct_answer: " + rAns + "," + AppConstants.PLAYER_OPT + ": " + selection + "," + AppConstants.PROGRESS_BAR_LEVEL + ": " + progressLevel + "}";
    }

    private String createJsonIntegerList() {
        integers = GenerateRandom.getRandomNumbers(150, this.players.size());
        String jsonString = "{ \"Integers\" : [ ";
        for (int count = 0; count < integers.size(); count++) {
            jsonString = jsonString + "\"" + integers.get(count) + "\"";
            if (count < integers.size() - 1) {
                jsonString = jsonString + " , ";
            }
        }
        return jsonString + "] }";
    }

    /* access modifiers changed from: private */
    public void checkIfReceived() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (MultiPlayer.this.isHost) {
                    if (!ServerClass.sentIntegers) {
                        MultiPlayer.this.checkIfReceived();
                        return;
                    }
                    ServerClass.sentIntegers = false;
                    MultiPlayer.this.setQuestion();
                    ServerClass unused = MultiPlayer.this.serverClass = new ServerClass(AppConstants.SERVER_PORT, AppConstants.CLIENT_PORT);
                    MultiPlayer.this.checkConnection();
                } else if (!ClientClass.receivedIntegers) {
                    MultiPlayer.this.checkIfReceived();
                } else {
                    ClientClass.receivedIntegers = false;
                    MultiPlayer.this.setQuestion();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            ClientClass unused = MultiPlayer.this.clientClass = new ClientClass(MultiPlayer.this.hostIP, AppConstants.CLIENT_PORT, AppConstants.SERVER_PORT);
                            MultiPlayer.this.checkConnection();
                        }
                    }, 1000);
                }
            }
        }, 1);
    }

    /* access modifiers changed from: private */
    public void checkConnection() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (MultiPlayer.this.isHost) {
                    if (!MultiPlayer.this.serverClass.received) {
                        MultiPlayer.this.checkConnection();
                        return;
                    }
                    MultiPlayer.this.serverClass.received = false;
                    MultiPlayer.this.getQuestion();
                    MultiPlayer.this.enable();
                } else if (!MultiPlayer.this.clientClass.received) {
                    MultiPlayer.this.checkConnection();
                } else {
                    MultiPlayer.this.clientClass.received = false;
                    MultiPlayer.this.getQuestion();
                    MultiPlayer.this.enable();
                }
            }
        }, 1);
    }

    private void disable() {
        this.layout.setVisibility(8);
        this.shade.setVisibility(0);
        this.loading.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public void enable() {
        this.layout.setVisibility(0);
        this.shade.setVisibility(8);
        this.loading.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        GlobalVariables.isMultiplayer = false;
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.localBroadcastManager.unregisterReceiver(this.broadcastReceiver);
    }
}
