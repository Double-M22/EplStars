package com.cyclon.com.allstar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Service.BackgroundSoundService;

public class Settings extends AppCompatActivity {
    private MediaPlayer btn_clicked;
    private boolean music = true;
    private Button musicToggle;
    private SharedPreferences sharedPreferences;
    private boolean sound = true;
    private Button soundToggle;
    private boolean stopMusic = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_settings);
        this.soundToggle = (Button) findViewById(R.id.sound_toggle);
        this.musicToggle = (Button) findViewById(R.id.music_toggle);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.sharedPreferences = defaultSharedPreferences;
        this.sound = defaultSharedPreferences.getBoolean(AppConstants.SOUND_PREF, true);
        this.music = this.sharedPreferences.getBoolean(AppConstants.MUSIC_PREF, true);
        if (this.sound) {
            this.soundToggle.setBackgroundResource(R.drawable.toggle_on);
        } else {
            this.soundToggle.setBackgroundResource(R.drawable.toggle_off);
        }
        if (this.music) {
            this.musicToggle.setBackgroundResource(R.drawable.toggle_on);
        } else {
            this.musicToggle.setBackgroundResource(R.drawable.toggle_off);
        }
        this.btn_clicked = MediaPlayer.create(this, R.raw.btn_clicked);
    }

    public void toggle_sound(View view) {
        if (this.sound) {
            this.btn_clicked.start();
            this.soundToggle.setBackgroundResource(R.drawable.toggle_off);
            this.sound = false;
        } else {
            this.soundToggle.setBackgroundResource(R.drawable.toggle_on);
            this.sound = true;
        }
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putBoolean(AppConstants.SOUND_PREF, this.sound);
        editor.apply();
    }

    public void toggle_music(View view) {
        if (this.sound) {
            this.btn_clicked.start();
        }
        if (this.music) {
            stopService(new Intent(this, BackgroundSoundService.class));
            this.musicToggle.setBackgroundResource(R.drawable.toggle_off);
            this.music = false;
        } else {
            startService(new Intent(this, BackgroundSoundService.class));
            this.musicToggle.setBackgroundResource(R.drawable.toggle_on);
            this.music = true;
        }
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putBoolean(AppConstants.MUSIC_PREF, this.music);
        editor.apply();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.stopMusic = false;
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.stopMusic) {
            stopService(new Intent(this, BackgroundSoundService.class));
        }
        finish();
    }
}
