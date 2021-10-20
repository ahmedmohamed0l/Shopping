package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Section extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
    }


    public void m3(View view) {
        Intent intent = new Intent(Section.this, Product.class);
        startActivity(intent);
    }

    public void Mycart(View view) {
        Intent intent = new Intent(Section.this, Mycart.class);
        startActivity(intent);
    }


    public void back(View view) {
        finish();
    }
}