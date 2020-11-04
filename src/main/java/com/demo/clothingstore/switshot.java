package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class switshot extends AppCompatActivity {
    private TextView switRalph;
    private TextView switTnf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switshot);
        switRalph = findViewById(R.id.switRalphPrice);
        Resources res = getResources();
        int cena = res.getInteger(R.integer.price_adidas_chernie);
        String cenaStr = Integer.toString(cena);
        String price = String.format(getString(R.string.price), cenaStr);
        switRalph.setText(price);

        switTnf = findViewById(R.id.switTnfPrice);
        Resources res1 = getResources();
        int cena1 = res1.getInteger(R.integer.price_adidas_chernie);
        String cenaStr1 = Integer.toString(cena1);
        String price1 = String.format(getString(R.string.price), cenaStr1);
        switTnf.setText(price1);
    }
}