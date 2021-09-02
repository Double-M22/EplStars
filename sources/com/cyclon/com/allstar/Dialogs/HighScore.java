package com.cyclon.com.allstar.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import com.cyclon.com.allstar.R;
import com.cyclon.com.allstar.Result;

public class HighScore extends Dialog {
    public HighScore(Activity context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.high_score);
        getWindow().setLayout(-1, -1);
        ((TextView) findViewById(R.id.new_high_score)).setText(Result.highScore);
    }
}
