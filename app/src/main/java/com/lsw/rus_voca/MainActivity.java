package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button goPg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goPg2 = (Button) findViewById(R.id.goPg2);

        goPg2.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.goPg2:
                    Intent intentHome12 = new Intent(MainActivity.this, Voca1Activity.class);
                    startActivity(intentHome12);
                    finish();
            }
        }
    };
}