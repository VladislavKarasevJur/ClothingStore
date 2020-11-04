package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class catal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catal);
    }

    public void hudi_catal(View view) {
        Intent intent = new Intent(this, hoodi.class);
        startActivity(intent);
    }

    public void krosi_catal(View view) {
        Intent intent = new Intent(this, krosi.class);
        startActivity(intent);
    }

    public void futb_catal(View view) {
        Intent intent = new Intent(this, futbolka.class);
        startActivity(intent);
    }

    public void swit_catal(View view) {
        Intent intent = new Intent(this, switshot.class);
        startActivity(intent);
    }
}