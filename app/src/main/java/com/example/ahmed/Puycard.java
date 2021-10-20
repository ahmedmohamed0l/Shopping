package com.example.ahmed;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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


