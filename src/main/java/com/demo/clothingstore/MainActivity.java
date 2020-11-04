package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void catalogOdejdi(View view) {
        Intent intent = new Intent(this, catal.class);
        startActivity(intent);
    }

    public void skidki(View view) {
    }

    public void opisanieMagazina(View view) {
        Intent intent = new Intent(this, ClotheInfo.class);
        startActivity(intent);
    }
}