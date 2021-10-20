package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mycart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycart);
    }


    public void M4(View view) {
        Intent intent = new Intent(Mycart.this, Remove.class);
        startActivity(intent);
    }


    public void Order(View view) {
        Intent intent = new Intent(Mycart.this, Order.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}