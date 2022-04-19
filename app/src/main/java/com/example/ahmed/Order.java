package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }


    public void puycard(View view) {
        Intent intent = new Intent(Order.this, Puycard.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}
