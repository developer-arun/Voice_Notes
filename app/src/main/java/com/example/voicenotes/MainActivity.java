package com.example.voicenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout view;
    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       view=findViewById(R.id.RelativeLayout);
       anim = (AnimationDrawable) view.getBackground();
       anim.setEnterFadeDuration(1500);
       anim.setExitFadeDuration(800);
       anim.start();


       CountDownTimer   mCountdowntimer =new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent =new Intent ( MainActivity.this,TakeNotes.class);
                startActivity(intent);
            }
        }.start();


    }



    }

