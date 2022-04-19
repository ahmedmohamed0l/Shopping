package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// test 2
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void m2(View view) {
        Intent intent = new Intent(Login.this, Home.class);
        startActivity(intent);
    }

    public void create(View view) {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }
}
