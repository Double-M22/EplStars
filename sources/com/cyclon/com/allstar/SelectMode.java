package com.cyclon.com.allstar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Service.BackgroundSoundService;

public class SelectMode extends AppCompatActivity {
    /* access modifiers changed from: private */
    public boolean stopMusic = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.select_mode);
        ((Button) findViewById(R.id.career_btn)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean unused = SelectMode.this.stopMusic = false;
                SelectMode.this.startActivity(new Intent(SelectMode.this, CareerMode.class));
                SelectMode.this.finish();
            }
        });
        ((Button) findViewById(R.id.multi_btn)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean unused = SelectMode.this.stopMusic = false;
                SelectMode.this.startActivity(new Intent(SelectMode.this, MyWifiConnection.class));
                SelectMode.this.finish();
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        this.stopMusic = false;
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
