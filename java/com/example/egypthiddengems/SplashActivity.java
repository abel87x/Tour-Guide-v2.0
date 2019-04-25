package com.example.egypthiddengems;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;

public class SplashActivity extends AppCompatActivity {

    //These lines of codes are used to generate a 4 seconds splash screen, using a Runnable and a Handler
    Runnable splashRun = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(SplashActivity.this, MainActivity.class),
                    ActivityOptions.makeSceneTransitionAnimation((Activity) SplashActivity.this).toBundle());
            finish();
        }
    };
    private int splashDelay = 4000;
    private Handler splashHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Slide());
        setContentView(R.layout.activity_splash);
        splashHandler.postDelayed(splashRun, splashDelay);
    }
}
