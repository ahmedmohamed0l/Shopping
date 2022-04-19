package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Finish extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }

    public void M2(View view) {
        Intent intent = new Intent(Finish.this, Home.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
    }
}