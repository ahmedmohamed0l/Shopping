package com.example.ahmed;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Remove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);
    }


    public void back(View view) {
        finish();
    }
}