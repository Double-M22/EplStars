package com.cyclon.com.allstar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Data.Data;
import com.cyclon.com.allstar.Data.DatabaseHelper;
import com.cyclon.com.allstar.Data.Teams;
import com.cyclon.com.allstar.Service.BackgroundSoundService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    private static List<Data> Arsenal = null;
    private static List<Data> Bournemouth = null;
    private static List<Data> Brighton = null;
    private static List<Data> Burnley = null;
    private static List<Data> Chelsea = null;
    private static List<Data> CrystalPalace = null;
    private static List<Data> Everton = null;
    private static List<Data> Huddersfield = null;
    private static List<Data> Leicester = null;
    private static List<Data> Liverpool = null;
    private static List<Data> ManchesterCity = null;
    private static List<Data> ManchesterUnited = null;
    private static List<Data> Newcastle = null;
    private static List<Data> Southampton = null;
    private static List<Data> StokeCity = null;
    private static List<Data> Swansea = null;
    private static final String TAG = "HomePageTAG";
    private static List<Data> Tottenham;
    private static List<Data> Watford;
    private static List<Data> WestBrom;
    private static List<Data> WestHam;
    private static DatabaseHelper dbHelper;
    public static Button play;
    public static Button score;
    public static Button setting;
    private boolean sound;
    /* access modifiers changed from: private */
    public boolean stopMusic = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_home_page);
        play = (Button) findViewById(R.id.play);
        setting = (Button) findViewById(R.id.settings);
        score = (Button) findViewById(R.id.score);
        dbHelper = new DatabaseHelper(this);
        createFile();
        createTeam();
        setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = HomePage.this.stopMusic = false;
                HomePage.this.startActivity(new Intent(HomePage.this, Settings.class));
            }
        });
        score.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = HomePage.this.stopMusic = false;
                HomePage.this.startActivity(new Intent(HomePage.this, Score.class));
            }
        });
    }

    public void play(View view) {
        this.stopMusic = false;
        if (this.sound) {
            MediaPlayer.create(this, R.raw.btn_clicked).start();
        }
        startActivity(new Intent(this, SelectMode.class));
    }

    public void createFile() {
        File file = getApplicationContext().getDatabasePath(AppConstants.TEAM_DB);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            if (copyDatabase(this)) {
                Log.d(TAG, "Copy Successful !!!");
            } else {
                Log.d(TAG, "Copy Error !!!");
            }
        } else if (file.delete()) {
            file.getParentFile().mkdirs();
            if (copyDatabase(this)) {
                Log.d(TAG, "Copy Successful !!!");
            } else {
                Log.d(TAG, "Copy Error !!!");
            }
        }
    }

    public boolean copyDatabase(Context context) {
        try {
            InputStream inputStream = context.getAssets().open(AppConstants.TEAM_DB);
            OutputStream outputStream = new FileOutputStream("/data/data/com.cyclon.com.allstar/databases/eplteams.sqlite");
            byte[] buff = new byte[1024];
            while (true) {
                int read = inputStream.read(buff);
                int length = read;
                if (read > 0) {
                    outputStream.write(buff, 0, length);
                } else {
                    outputStream.flush();
                    outputStream.close();
                    inputStream.close();
                    Log.d(TAG, "Database Copied");
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void createTeam() {
        for (int counter = 1; counter <= 20; counter++) {
            switch (counter) {
                case 1:
                    Arsenal = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 2:
                    Bournemouth = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 3:
                    Brighton = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 4:
                    Burnley = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 5:
                    Chelsea = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 6:
                    CrystalPalace = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 7:
                    Everton = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 8:
                    Huddersfield = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 9:
                    Leicester = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 10:
                    Liverpool = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 11:
                    ManchesterCity = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 12:
                    ManchesterUnited = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 13:
                    Newcastle = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 14:
                    Southampton = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 15:
                    StokeCity = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 16:
                    Swansea = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 17:
                    Tottenham = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 18:
                    Watford = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 19:
                    WestBrom = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
                case 20:
                    WestHam = dbHelper.getDataItems(Teams.myTeams(counter));
                    break;
            }
        }
    }

    public static List<Data> mergeTeams(int from, int to) {
        List<Data> allTeams = new ArrayList<>();
        for (int counter = from; counter <= to; counter++) {
            switch (counter) {
                case 1:
                    allTeams.addAll(ManchesterUnited);
                    break;
                case 2:
                    allTeams.addAll(Chelsea);
                    break;
                case 3:
                    allTeams.addAll(Arsenal);
                    break;
                case 4:
                    allTeams.addAll(Liverpool);
                    break;
                case 5:
                    allTeams.addAll(Tottenham);
                    break;
                case 6:
                    allTeams.addAll(ManchesterCity);
                    break;
                case 7:
                    allTeams.addAll(Everton);
                    break;
                case 8:
                    allTeams.addAll(Leicester);
                    break;
                case 9:
                    allTeams.addAll(CrystalPalace);
                    break;
                case 10:
                    allTeams.addAll(Burnley);
                    break;
                case 11:
                    allTeams.addAll(StokeCity);
                    break;
                case 12:
                    allTeams.addAll(Southampton);
                    break;
                case 13:
                    allTeams.addAll(Newcastle);
                    break;
                case 14:
                    allTeams.addAll(WestHam);
                    break;
                case 15:
                    allTeams.addAll(WestBrom);
                    break;
                case 16:
                    allTeams.addAll(Watford);
                    break;
                case 17:
                    allTeams.addAll(Swansea);
                    break;
                case 18:
                    allTeams.addAll(Bournemouth);
                    break;
                case 19:
                    allTeams.addAll(Brighton);
                    break;
                case 20:
                    allTeams.addAll(Huddersfield);
                    break;
            }
        }
        return allTeams;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.stopMusic = true;
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.sound = sharedPreferences.getBoolean(AppConstants.SOUND_PREF, true);
        if (sharedPreferences.getBoolean(AppConstants.MUSIC_PREF, true)) {
            startService();
        }
    }

    private void startService() {
        startService(new Intent(this, BackgroundSoundService.class));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.stopMusic) {
            stopService(new Intent(this, BackgroundSoundService.class));
        }
    }
}
