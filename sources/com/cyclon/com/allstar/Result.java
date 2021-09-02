package com.cyclon.com.allstar;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Dialogs.HighScore;
import com.cyclon.com.allstar.Service.BackgroundSoundService;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Result extends AppCompatActivity {
    public static String highScore;
    public static String my_score;
    /* access modifiers changed from: private */
    public DatabaseReference dbRef;
    /* access modifiers changed from: private */
    public ArrayList<String> myScores = new ArrayList<>();
    /* access modifiers changed from: private */
    public boolean stopMusic = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.result);
        this.dbRef = FirebaseDatabase.getInstance().getReference().child(AppConstants.GRAND_SCORE);
        Intent intent = getIntent();
        my_score = intent.getStringExtra(AppConstants.SCORE);
        String no_of_right = intent.getStringExtra(AppConstants.RIGHTS);
        String no_of_wrong = intent.getStringExtra(AppConstants.WRONGS);
        boolean isHighScore = intent.getBooleanExtra(AppConstants.IS_HIGH_SCORE, false);
        boolean isNewRecord = intent.getBooleanExtra(AppConstants.IS_NEW_RECORD, false);
        Button score_view = (Button) findViewById(R.id.result_view_score);
        Button retry = (Button) findViewById(R.id.result_retry);
        Button home = (Button) findViewById(R.id.result_home);
        View result_bar = findViewById(R.id.result_bar);
        View newRecordBar = findViewById(R.id.new_record_bar);
        TextView score = (TextView) findViewById(R.id.result_score);
        TextView right_count = (TextView) findViewById(R.id.right_number);
        TextView wrong_count = (TextView) findViewById(R.id.wrong_number);
        newRecordBar.setVisibility(8);
        if (isHighScore) {
            result_bar.setBackgroundResource(R.drawable.congrats);
            newRecordBar.setVisibility(0);
            highScore = my_score;
            startHighScoreDialog();
        } else if (isNewRecord) {
            result_bar.setBackgroundResource(R.drawable.congrats);
            newRecordBar.setVisibility(0);
        }
        score.setText("Score : " + my_score);
        right_count.setText(no_of_right);
        wrong_count.setText(no_of_wrong);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Result.this.finish();
                boolean unused = Result.this.stopMusic = false;
            }
        });
        retry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = Result.this.stopMusic = false;
                Result.this.startActivity(new Intent(Result.this, CareerMode.class));
                Result.this.finish();
            }
        });
        score_view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        if (isNetworkAvailable()) {
            Intent intent2 = intent;
            new Thread(new Runnable() {
                public void run() {
                    Result.this.checkFirebase();
                }
            }).start();
            return;
        }
    }

    private void startHighScoreDialog() {
        HighScore hs = new HighScore(this);
        hs.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        hs.setCancelable(true);
        hs.show();
    }

    /* access modifiers changed from: private */
    public void checkFirebase() {
        final int score = Integer.parseInt(my_score);
        this.dbRef.addListenerForSingleValueEvent(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChildren()) {
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        Result.this.myScores.add((String) ds.getValue());
                    }
                }
                if (Result.this.myScores.size() > 0) {
                    int value = 0;
                    Iterator it = Result.this.myScores.iterator();
                    while (it.hasNext()) {
                        int i = Integer.parseInt((String) it.next());
                        if (i > value) {
                            value = i;
                        }
                    }
                    if (score > value) {
                        Result.this.dbRef.child("Mike").setValue(Integer.valueOf(score));
                        return;
                    }
                    return;
                }
                Result.this.dbRef.child("Mike").setValue(Integer.valueOf(score));
            }

            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }

    private boolean isNetworkAvailable() {
        NetworkInfo networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.stopMusic) {
            stopService(new Intent(this, BackgroundSoundService.class));
        }
    }
}
