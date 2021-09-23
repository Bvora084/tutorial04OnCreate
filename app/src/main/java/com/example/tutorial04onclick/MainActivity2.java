package com.example.tutorial04onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textwelcome = findViewById(R.id.textwelcome);

        Intent intent = getIntent();
        String userdatavalue = intent.getStringExtra("userdata");
        textwelcome.setText("welcome" + userdatavalue);

        Toast.makeText(this, userdatavalue, Toast.LENGTH_SHORT).show();

    }
}