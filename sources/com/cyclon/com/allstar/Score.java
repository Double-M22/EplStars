package com.cyclon.com.allstar;

import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Data.ScoresDatabase;
import com.cyclon.com.allstar.Service.BackgroundSoundService;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Score extends AppCompatActivity {
    int count;
    /* access modifiers changed from: private */
    public DatabaseReference dbRef;
    /* access modifiers changed from: private */
    public TextView grand_score;
    int h_score;
    private TextView high_score;
    /* access modifiers changed from: private */
    public ArrayList<String> myScores = new ArrayList<>();
    /* access modifiers changed from: private */
    public RelativeLayout rl;
    private TextView score_2;
    private TextView score_3;
    private boolean stopMusic = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_score);
        this.high_score = (TextView) findViewById(R.id.high_score);
        this.score_2 = (TextView) findViewById(R.id.score_2);
        this.score_3 = (TextView) findViewById(R.id.score_3);
        this.grand_score = (TextView) findViewById(R.id.grand_score);
        this.dbRef = FirebaseDatabase.getInstance().getReference().child(AppConstants.GRAND_SCORE);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.grand_score_layout);
        this.rl = relativeLayout;
        relativeLayout.setVisibility(8);
        checkDatabase();
        if (isNetworkAvailable()) {
            checkFirebase();
        }
    }

    private void checkFirebase() {
        this.dbRef.addListenerForSingleValueEvent(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChildren()) {
                    Score.this.rl.setVisibility(0);
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        Score.this.myScores.add(Long.toString(((Long) ds.getValue()).longValue()));
                        Score.this.count++;
                    }
                    int value = 0;
                    Iterator it = Score.this.myScores.iterator();
                    while (it.hasNext()) {
                        int i = Integer.parseInt((String) it.next());
                        if (i > value) {
                            value = i;
                        }
                    }
                    if (Score.this.h_score > value) {
                        Score.this.grand_score.setText("" + Score.this.h_score);
                        Score.this.dbRef.child("_" + Score.this.count).setValue("" + Score.this.h_score);
                        return;
                    }
                    Score.this.grand_score.setText("" + value);
                    return;
                }
                Score.this.dbRef.child("_0").setValue("" + Score.this.h_score);
                Score.this.rl.setVisibility(0);
            }

            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }

    private void checkDatabase() {
        Cursor cursor = new ScoresDatabase(this).getHighScores();
        ArrayList<String> storedScore = new ArrayList<>();
        int count2 = cursor.getCount();
        if (count2 == 0) {
            this.high_score.setText("00");
            this.score_2.setText("00");
            this.score_3.setText("00");
        } else if (count2 == 1) {
            if (cursor.moveToNext() != 0) {
                storedScore.add(cursor.getString(1));
            } else {
                Log.e("Career", "No such row available");
            }
            int _1st_score = Integer.parseInt(storedScore.get(0));
            this.high_score.setText("" + _1st_score);
            this.h_score = _1st_score;
            this.score_2.setText("00");
            this.score_3.setText("00");
        } else if (count2 == 2) {
            while (cursor.moveToNext() != 0) {
                storedScore.add(cursor.getString(1));
            }
            int _1st_score2 = Integer.parseInt(storedScore.get(0));
            int _2nd_score = Integer.parseInt(storedScore.get(1));
            this.h_score = _2nd_score;
            this.high_score.setText("" + _2nd_score);
            this.score_2.setText("" + _1st_score2);
            this.score_3.setText("00");
        } else if (count2 == 3) {
            while (cursor.moveToNext()) {
                storedScore.add(cursor.getString(1));
            }
            int _1st_score3 = Integer.parseInt(storedScore.get(0));
            int _2nd_score2 = Integer.parseInt(storedScore.get(1));
            int _3rd_score = Integer.parseInt(storedScore.get(2));
            this.h_score = _3rd_score;
            Log.e("Scores", _1st_score3 + " : " + _2nd_score2 + " : " + _3rd_score);
            this.high_score.setText("" + _3rd_score);
            this.score_2.setText("" + _2nd_score2);
            this.score_3.setText("" + _1st_score3);
        }
    }

    private boolean isNetworkAvailable() {
        NetworkInfo networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public void onBackPressed() {
        this.stopMusic = false;
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        finish();
        if (this.stopMusic) {
            stopService(new Intent(this, BackgroundSoundService.class));
        }
    }
}
