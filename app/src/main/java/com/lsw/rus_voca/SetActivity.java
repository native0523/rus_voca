package com.lsw.rus_voca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SetActivity extends AppCompatActivity {

    LinearLayout frame1, frame2, frame3, frame4, frame5;
    Button frameBtn1, frameBtn2, frameBtn3, frameBtn4, frameBtn5, switchHome, switchF1, switchF2, switchF3, switchF4, switchF5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        frame1 = (LinearLayout) findViewById(R.id.frame1);
        frame2 = (LinearLayout) findViewById(R.id.frame2);
        frame3 = (LinearLayout) findViewById(R.id.frame3);
        frame4 = (LinearLayout) findViewById(R.id.frame4);
        frame5 = (LinearLayout) findViewById(R.id.frame5);

        frameBtn1 = (Button) findViewById(R.id.frameBtn1);
        frameBtn2 = (Button) findViewById(R.id.frameBtn2);
        frameBtn3 = (Button) findViewById(R.id.frameBtn3);
        frameBtn4 = (Button) findViewById(R.id.frameBtn4);
        frameBtn5 = (Button) findViewById(R.id.frameBtn5);
        switchHome = (Button) findViewById(R.id.switchHome);
        switchF1 = (Button) findViewById(R.id.switchF1);
        switchF2 = (Button) findViewById(R.id.switchF2);
        switchF3 = (Button) findViewById(R.id.switchF3);
        switchF4 = (Button) findViewById(R.id.switchF4);
        switchF5 = (Button) findViewById(R.id.switchF5);

        frameBtn1.setOnClickListener(mClickListener);
        frameBtn2.setOnClickListener(mClickListener);
        frameBtn3.setOnClickListener(mClickListener);
        frameBtn4.setOnClickListener(mClickListener);
        frameBtn5.setOnClickListener(mClickListener);
        switchHome.setOnClickListener(mClickListener);
        switchF1.setOnClickListener(mClickListener);
        switchF2.setOnClickListener(mClickListener);
        switchF3.setOnClickListener(mClickListener);
        switchF4.setOnClickListener(mClickListener);
        switchF5.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            frame1.setVisibility(View.INVISIBLE);
            frame2.setVisibility(View.INVISIBLE);
            frame3.setVisibility(View.INVISIBLE);
            frame4.setVisibility(View.INVISIBLE);
            frame5.setVisibility(View.INVISIBLE);

            switch (v.getId()) {
                case R.id.switchF1:
                    frame1.setVisibility(View.VISIBLE);
                    break;

                case R.id.switchF2:
                    frame2.setVisibility(View.VISIBLE);
                    break;

                case R.id.switchF3:
                    frame3.setVisibility(View.VISIBLE);
                    break;

                case R.id.switchF4:
                    frame4.setVisibility(View.VISIBLE);
                    break;

                case R.id.switchF5:
                    frame5.setVisibility(View.VISIBLE);
                    break;

                case R.id.switchHome:
                    Intent intent71 = new Intent(SetActivity.this, MainActivity.class);
                    startActivity(intent71);
                    finish();
                    break;

                case R.id.frameBtn1:
                    Intent intent72 = new Intent(SetActivity.this, Voca1Activity.class);
                    startActivity(intent72);
                    finish();
                    break;

                case R.id.frameBtn2:
                    Intent intent73 = new Intent(SetActivity.this, Voca2Activity.class);
                    startActivity(intent73);
                    finish();
                    break;

                case R.id.frameBtn3:
                    Intent intent74 = new Intent(SetActivity.this, Voca3Activity.class);
                    startActivity(intent74);
                    finish();
                    break;

                case R.id.frameBtn4:
                    Intent intent75 = new Intent(SetActivity.this, Voca4Activity.class);
                    startActivity(intent75);
                    finish();
                    break;

                case R.id.frameBtn5:
                    Intent intent76 = new Intent(SetActivity.this, Voca5Activity.class);
                    startActivity(intent76);
                    finish();
                    break;
            }
        }
    };
}




