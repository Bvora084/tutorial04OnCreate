package com.example.tutorial04onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtusername,edtpassword;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void function(View view) {


        edtusername = findViewById(R.id.edtusername);
        edtpassword = findViewById(R.id.edtpassword);
        btnlogin = findViewById(R.id.btnlogin);

        String valusername = edtusername.getText().toString();
        String valpassword = edtpassword.getText().toString();
        Log.i("LoginScreen","In onClick");



        if (!Patterns.EMAIL_ADDRESS.matcher(valusername).matches()){
            Toast.makeText(MainActivity.this, "Enter proper email address", Toast.LENGTH_SHORT).show();
        }
        if(valusername.equals("brijeshvora2002@gmail.com") && valpassword.equals("brijesh007")){
            Log.i("LoginScreen", "In onClick If");

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("userdata",valusername);
            startActivity(intent);
            finish();

            Toast.makeText(MainActivity.this, "Login Successfully ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
            Log.i("LoginScreen", "In onClick else");

        }


    }
}