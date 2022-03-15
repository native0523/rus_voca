package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Voca1Activity extends AppCompatActivity {

    Button backPg1, goPg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca1);

        backPg1 = (Button) findViewById(R.id.backPg1);
        goPg3 = (Button) findViewById(R.id.goPg3);

        backPg1.setOnClickListener(mClickListener);
        goPg3.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.backPg1:
                    Intent intentHome21 = new Intent(Voca1Activity.this, MainActivity.class);
                    startActivity(intentHome21);
                    finish();
                    break;

                case R.id.goPg3:
                    Intent intentHome23 = new Intent(Voca1Activity.this, Voca2Activity.class);
                    startActivity(intentHome23);
                    finish();
            }
        }
    };
}