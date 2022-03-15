package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Voca2Activity extends AppCompatActivity {

    Button backPg2, goPg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca2);

        backPg2 = (Button) findViewById(R.id.backPg2);
        goPg4 = (Button) findViewById(R.id.goPg4);

        backPg2.setOnClickListener(mClickListener);
        goPg4.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.backPg2:
                    Intent intentHome32 = new Intent(Voca2Activity.this, Voca1Activity.class);
                    startActivity(intentHome32);
                    finish();
                    break;

                case R.id.goPg4:
                    Intent intentHome34 = new Intent(Voca2Activity.this, Voca3Activity.class);
                    startActivity(intentHome34);
                    finish();
            }




        }


        };
    };
