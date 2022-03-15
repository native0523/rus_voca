package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Voca5Activity extends AppCompatActivity {

    Button backPg5, goPg7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca5);

        backPg5 = (Button) findViewById(R.id.backPg5);
        goPg7 = (Button) findViewById(R.id.goPg7);

        backPg5.setOnClickListener(mClickListener);
        goPg7.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.backPg5:
                    Intent intentHome65 = new Intent(Voca5Activity.this, Voca4Activity.class);
                    startActivity(intentHome65);
                    finish();
                    break;

                case R.id.goPg7:
                    Intent intentHome67 = new Intent(Voca5Activity.this, SetActivity.class);
                    startActivity(intentHome67);
                    finish();
            }
        }
    };
};





