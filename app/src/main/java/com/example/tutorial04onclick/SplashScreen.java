package com.example.tutorial04onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    TextView textwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent a2 = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(a2);

            }
        },2000);

    }
}