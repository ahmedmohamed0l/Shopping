package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Puycard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puycard);
    }


    public void Finish(View view) {
        Intent intent = new Intent(Puycard.this, Finish.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}


