package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }


    public void Mycart(View view) {
        Intent intent = new Intent(Product.this, Mycart.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}
