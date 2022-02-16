package com.example.ahmed;
// test commit
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// test from ahmed

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void mainm3(View view) {
        Intent intent = new Intent(Home.this, Product.class);
        startActivity(intent);
    }

    public void m1(View view) {
        Intent intent = new Intent(Home.this, Section.class);
        startActivity(intent);
    }

    public void mycart(View view) {
        Intent intent = new Intent(Home.this, Mycart.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}