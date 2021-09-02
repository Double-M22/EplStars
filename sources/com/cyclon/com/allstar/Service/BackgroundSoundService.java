package com.cyclon.com.allstar.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import com.cyclon.com.allstar.R;

public class BackgroundSoundService extends Service {
    MediaPlayer mediaPlayer;

    public void onCreate() {
        super.onCreate();
        MediaPlayer create = MediaPlayer.create(this, R.raw.backgroud_music);
        this.mediaPlayer = create;
        create.setLooping(true);
        this.mediaPlayer.setVolume(0.0f, 100.0f);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        this.mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mediaPlayer.stop();
        this.mediaPlayer.release();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
