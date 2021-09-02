package com.cyclon.com.allstar;

import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Data.Data;
import com.cyclon.com.allstar.Data.ScoresDatabase;
import com.cyclon.com.allstar.RandomGenerator.GenerateRandom;
import com.cyclon.com.allstar.Service.BackgroundSoundService;
import java.util.ArrayList;
import java.util.List;

public class CareerMode extends AppCompatActivity {
    /* access modifiers changed from: private */
    public String answer;
    private MediaPlayer btn_clicked;
    /* access modifiers changed from: private */
    public boolean cancelProgress = false;
    private int counter;
    /* access modifiers changed from: private */
    public MediaPlayer d_hat_trick;
    private List<Data> data = new ArrayList();
    private boolean highScore = false;
    private View life1;
    private View life2;
    private View life3;
    private View life4;
    private View life5;
    private int life_count;
    /* access modifiers changed from: private */
    public Handler myHandler = new Handler();
    private boolean newRecord = false;
    private int no_of_right;
    private int no_of_wrong;
    /* access modifiers changed from: private */
    public Button opt_1;
    /* access modifiers changed from: private */
    public Button opt_2;
    /* access modifiers changed from: private */
    public Button opt_3;
    /* access modifiers changed from: private */
    public Button opt_4;
    private List<Integer> positions = new ArrayList();
    /* access modifiers changed from: private */
    public ProgressBar progressBar;
    /* access modifiers changed from: private */
    public int progressStatus;
    private TextView qst;
    private int questions_count;
    /* access modifiers changed from: private */
    public MediaPlayer right;
    /* access modifiers changed from: private */
    public int right_count;
    private TextView score;
    /* access modifiers changed from: private */
    public int score_count;
    /* access modifiers changed from: private */
    public boolean sound;
    private boolean stopMusic = true;
    /* access modifiers changed from: private */
    public Handler wait = new Handler();
    private MediaPlayer wrong;

    static /* synthetic */ int access$1310(CareerMode x0) {
        int i = x0.progressStatus;
        x0.progressStatus = i - 1;
        return i;
    }

    static /* synthetic */ int access$1410(CareerMode x0) {
        int i = x0.life_count;
        x0.life_count = i - 1;
        return i;
    }

    static /* synthetic */ int access$608(CareerMode x0) {
        int i = x0.no_of_right;
        x0.no_of_right = i + 1;
        return i;
    }

    static /* synthetic */ int access$708(CareerMode x0) {
        int i = x0.right_count;
        x0.right_count = i + 1;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_career_mode);
        this.no_of_right = 0;
        this.no_of_wrong = 0;
        this.qst = (TextView) findViewById(R.id.cQst);
        this.opt_1 = (Button) findViewById(R.id.cOpt_1);
        this.opt_2 = (Button) findViewById(R.id.cOpt_2);
        this.opt_3 = (Button) findViewById(R.id.cOpt_3);
        this.opt_4 = (Button) findViewById(R.id.cOpt_4);
        this.progressBar = (ProgressBar) findViewById(R.id.cProgressBar);
        this.sound = PreferenceManager.getDefaultSharedPreferences(this).getBoolean(AppConstants.SOUND_PREF, true);
        this.score = (TextView) findViewById(R.id.career_score);
        this.life1 = findViewById(R.id.life1);
        this.life2 = findViewById(R.id.life2);
        this.life3 = findViewById(R.id.life3);
        this.life4 = findViewById(R.id.life4);
        this.life5 = findViewById(R.id.life5);
        this.life_count = 3;
        this.right_count = 0;
        this.score_count = 0;
        this.right = MediaPlayer.create(this, R.raw.correct);
        this.wrong = MediaPlayer.create(this, R.raw.wrong);
        this.btn_clicked = MediaPlayer.create(this, R.raw.btn_clicked);
        this.d_hat_trick = MediaPlayer.create(this, R.raw.d_hat_trick);
        this.data = HomePage.mergeTeams(1, 20);
        this.positions = GenerateRandom.getRandomNumbers(20, HomePage.mergeTeams(1, 6).size());
        this.counter = 0;
        this.questions_count = 0;
        checkLives();
        this.opt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CareerMode careerMode = CareerMode.this;
                careerMode.btnClicked(careerMode.opt_1);
            }
        });
        this.opt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CareerMode careerMode = CareerMode.this;
                careerMode.btnClicked(careerMode.opt_2);
            }
        });
        this.opt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CareerMode careerMode = CareerMode.this;
                careerMode.btnClicked(careerMode.opt_3);
            }
        });
        this.opt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CareerMode careerMode = CareerMode.this;
                careerMode.btnClicked(careerMode.opt_4);
            }
        });
    }

    /* access modifiers changed from: private */
    public void btnClicked(final Button btn) {
        if (this.sound) {
            this.btn_clicked.start();
        }
        animateBtn(btn, 200, 1200);
        this.cancelProgress = true;
        this.opt_1.setClickable(false);
        this.opt_2.setClickable(false);
        this.opt_3.setClickable(false);
        this.opt_4.setClickable(false);
        btn.setBackgroundResource(R.drawable.button_clicked);
        this.wait.postDelayed(new Runnable() {
            public void run() {
                if (btn.getText().toString().equals(CareerMode.this.answer)) {
                    CareerMode.access$608(CareerMode.this);
                    CareerMode.access$708(CareerMode.this);
                    if (CareerMode.this.right_count == 6) {
                        if (CareerMode.this.sound) {
                            CareerMode.this.d_hat_trick.start();
                        }
                    } else if (CareerMode.this.sound) {
                        CareerMode.this.right.start();
                    }
                    btn.setBackgroundResource(R.drawable.button_right);
                    btn.clearAnimation();
                    CareerMode.this.animateBtn(btn, 170, 1000);
                    CareerMode careerMode = CareerMode.this;
                    int unused = careerMode.score_count = careerMode.score_count + (CareerMode.this.progressStatus / 20) + 1;
                } else {
                    CareerMode.access$1410(CareerMode.this);
                    int unused2 = CareerMode.this.right_count = 0;
                    btn.setBackgroundResource(R.drawable.button_wrong);
                    CareerMode.this.getRightAnswer();
                }
                CareerMode.this.wait.postDelayed(new Runnable() {
                    public void run() {
                        CareerMode.this.checkLives();
                    }
                }, 1100);
            }
        }, 1200);
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

    private void setData() {
        ArrayList<String> options = new ArrayList<>();
        for (Integer intValue : GenerateRandom.getRandomArrangement(4)) {
            int i = intValue.intValue();
            if (i == 0) {
                options.add(this.data.get(this.positions.get(this.counter).intValue()).getOpt_1());
            } else if (i == 1) {
                options.add(this.data.get(this.positions.get(this.counter).intValue()).getOpt_2());
            } else if (i == 2) {
                options.add(this.data.get(this.positions.get(this.counter).intValue()).getOpt_3());
            } else if (i == 3) {
                options.add(this.data.get(this.positions.get(this.counter).intValue()).getOpt_4());
            }
        }
        this.score.setText("Score : " + this.score_count);
        this.opt_1.setClickable(true);
        this.opt_2.setClickable(true);
        this.opt_3.setClickable(true);
        this.opt_4.setClickable(true);
        this.opt_1.setBackgroundResource(R.drawable.button);
        this.opt_2.setBackgroundResource(R.drawable.button);
        this.opt_3.setBackgroundResource(R.drawable.button);
        this.opt_4.setBackgroundResource(R.drawable.button);
        this.qst.setText(this.data.get(this.positions.get(this.counter).intValue()).getSurname());
        this.opt_1.setText(options.get(0));
        this.opt_2.setText(options.get(1));
        this.opt_3.setText(options.get(2));
        this.opt_4.setText(options.get(3));
        this.answer = this.data.get(this.positions.get(this.counter).intValue()).getAns();
        if (!this.data.isEmpty()) {
            this.data.remove(this.positions.get(this.counter));
        } else {
            Toast.makeText(this, "Wow completed all questions!!!", 0).show();
        }
        this.counter++;
        int i2 = this.questions_count + 1;
        this.questions_count = i2;
        if (i2 == 20) {
            Toast.makeText(this, "Now 20 : " + this.positions.size(), 0).show();
            this.positions = GenerateRandom.getRandomArrangement(this.data.size());
            Toast.makeText(this, "Position : " + this.positions.size(), 0).show();
            this.counter = 0;
        }
        this.progressStatus = 200;
        new Thread(new Runnable() {
            public void run() {
                while (CareerMode.this.progressStatus > 0) {
                    if (CareerMode.this.cancelProgress) {
                        boolean unused = CareerMode.this.cancelProgress = false;
                        return;
                    }
                    CareerMode.access$1310(CareerMode.this);
                    CareerMode.this.myHandler.post(new Runnable() {
                        public void run() {
                            if (CareerMode.this.progressStatus == 0) {
                                CareerMode.this.opt_1.setClickable(false);
                                CareerMode.this.opt_2.setClickable(false);
                                CareerMode.this.opt_3.setClickable(false);
                                CareerMode.this.opt_4.setClickable(false);
                                CareerMode.this.refreshQuestion();
                            }
                            CareerMode.this.progressBar.setProgress(CareerMode.this.progressStatus);
                        }
                    });
                    if (CareerMode.this.progressStatus == 0) {
                        int unused2 = CareerMode.this.right_count = 0;
                        CareerMode.access$1410(CareerMode.this);
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public void checkLives() {
        if (this.life_count != 0) {
            int i = this.right_count;
            if (i == 6 || i == 15 || i == 30 || i == 60 || i == 120 || i == 240) {
                this.score_count += 10;
                int i2 = this.life_count;
                if (i2 < 5) {
                    this.life_count = i2 + 1;
                }
            }
            int i3 = this.life_count;
            if (i3 == 1) {
                this.life1.setVisibility(0);
                this.life2.setVisibility(4);
                this.life3.setVisibility(4);
                this.life4.setVisibility(4);
                this.life5.setVisibility(4);
            } else if (i3 == 2) {
                this.life1.setVisibility(0);
                this.life2.setVisibility(0);
                this.life3.setVisibility(4);
                this.life4.setVisibility(4);
                this.life5.setVisibility(4);
            } else if (i3 == 3) {
                this.life1.setVisibility(0);
                this.life2.setVisibility(0);
                this.life3.setVisibility(0);
                this.life4.setVisibility(4);
                this.life5.setVisibility(4);
            } else if (i3 == 4) {
                this.life1.setVisibility(0);
                this.life2.setVisibility(0);
                this.life3.setVisibility(0);
                this.life4.setVisibility(0);
                this.life5.setVisibility(4);
            } else if (i3 == 5) {
                this.life1.setVisibility(0);
                this.life2.setVisibility(0);
                this.life3.setVisibility(0);
                this.life4.setVisibility(0);
                this.life5.setVisibility(0);
            }
            setData();
            return;
        }
        this.life1.setVisibility(4);
        this.life2.setVisibility(4);
        this.life3.setVisibility(4);
        this.life4.setVisibility(4);
        this.life5.setVisibility(4);
        this.cancelProgress = true;
        showResult();
    }

    private void showResult() {
        checkDatabase(this.score_count);
        this.stopMusic = false;
        Intent intent = new Intent(this, Result.class);
        intent.putExtra(AppConstants.IS_HIGH_SCORE, this.highScore);
        intent.putExtra(AppConstants.IS_NEW_RECORD, this.newRecord);
        intent.putExtra(AppConstants.SCORE, "" + this.score_count);
        intent.putExtra(AppConstants.RIGHTS, "" + this.no_of_right);
        intent.putExtra(AppConstants.WRONGS, "" + this.no_of_wrong);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public void refreshQuestion() {
        getRightAnswer();
        this.wait.postDelayed(new Runnable() {
            public void run() {
                if (!CareerMode.this.cancelProgress) {
                    CareerMode.this.checkLives();
                }
            }
        }, 1000);
    }

    /* access modifiers changed from: private */
    public void getRightAnswer() {
        if (this.sound) {
            this.wrong.start();
        }
        this.no_of_wrong++;
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

    private void checkDatabase(int score2) {
        this.highScore = false;
        this.newRecord = false;
        ScoresDatabase scoresDatabase = new ScoresDatabase(this);
        Cursor cursor = scoresDatabase.getHighScores();
        ArrayList<String> storedScore = new ArrayList<>();
        int count = cursor.getCount();
        if (count == 0) {
            scoresDatabase.insertHighScore(Integer.toString(score2));
            if (score2 > 0) {
                this.highScore = true;
            }
        } else if (count == 1) {
            if (cursor.moveToNext() != 0) {
                storedScore.add(cursor.getString(1));
            } else {
                Log.e("Career", "No such row available");
            }
            if (score2 > Integer.parseInt(storedScore.get(0))) {
                scoresDatabase.insertHighScore(Integer.toString(score2));
                this.highScore = true;
            }
        } else if (count == 2) {
            while (cursor.moveToNext() != 0) {
                storedScore.add(cursor.getString(1));
            }
            int _1st_score = Integer.parseInt(storedScore.get(0));
            if (score2 > Integer.parseInt(storedScore.get(1))) {
                scoresDatabase.insertHighScore(Integer.toString(score2));
                this.highScore = true;
            } else if (score2 > _1st_score) {
                scoresDatabase.updateHighScore(Integer.toString(score2), Integer.toString(_1st_score));
                this.newRecord = true;
            }
        } else if (count == 3) {
            while (cursor.moveToNext()) {
                storedScore.add(cursor.getString(1));
            }
            int _1st_score2 = Integer.parseInt(storedScore.get(0));
            int _2nd_score = Integer.parseInt(storedScore.get(1));
            int _3rd_score = Integer.parseInt(storedScore.get(2));
            if (score2 > _3rd_score) {
                scoresDatabase.updateHighScore(Integer.toString(score2), Integer.toString(_3rd_score));
                this.highScore = true;
            } else if (score2 > _2nd_score) {
                scoresDatabase.updateHighScore(Integer.toString(score2), Integer.toString(_2nd_score));
                this.newRecord = true;
            } else if (score2 > _1st_score2) {
                scoresDatabase.updateHighScore(Integer.toString(score2), Integer.toString(_1st_score2));
                this.newRecord = true;
            }
        }
    }

    public void onBackPressed() {
        this.stopMusic = false;
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.cancelProgress = true;
        finish();
        if (this.stopMusic) {
            stopService(new Intent(this, BackgroundSoundService.class));
        }
    }
}
