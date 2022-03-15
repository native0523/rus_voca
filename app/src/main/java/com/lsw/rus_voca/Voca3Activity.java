package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Voca3Activity extends AppCompatActivity {

    Button backPg3, goPg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca3);

        backPg3 = (Button) findViewById(R.id.backPg3);
        goPg5 = (Button) findViewById(R.id.goPg5);

        backPg3.setOnClickListener(mClickListener);
        goPg5.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.backPg3:
                    Intent intentHome43 = new Intent(Voca3Activity.this, Voca2Activity.class);
                    startActivity(intentHome43);
                    finish();
                    break;

                case R.id.goPg5:
                    Intent intentHome45 = new Intent(Voca3Activity.this, Voca4Activity.class);
                    startActivity(intentHome45);
                    finish();
            }
        }
    };
};





