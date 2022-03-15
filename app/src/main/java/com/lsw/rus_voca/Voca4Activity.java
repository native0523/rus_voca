package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Voca4Activity extends AppCompatActivity {

    Button backPg4, goPg6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca4);

        backPg4 = (Button) findViewById(R.id.backPg4);
        goPg6 = (Button) findViewById(R.id.goPg6);

        backPg4.setOnClickListener(mClickListener);
        goPg6.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.backPg4:
                    Intent intentHome54 = new Intent(Voca4Activity.this, Voca3Activity.class);
                    startActivity(intentHome54);
                    finish();
                    break;

                case R.id.goPg6:
                    Intent intentHome56 = new Intent(Voca4Activity.this, Voca5Activity.class);
                    startActivity(intentHome56);
                    finish();
            }
        }
    };
};





