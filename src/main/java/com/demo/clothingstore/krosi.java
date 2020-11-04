package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class krosi extends AppCompatActivity {
    private TextView krosiAdik;
    private TextView krosiNike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krosi);
        krosiAdik = findViewById(R.id.krosiAdikPrice);
        Resources res = getResources();
        int cena = res.getInteger(R.integer.price_adidas_chernie);
        String cenaStr = Integer.toString(cena);
        String price = String.format(getString(R.string.price), cenaStr);
        krosiAdik.setText(price);

        krosiNike = findViewById(R.id.krosiNikePrice);
        Resources res1 = getResources();
        int cena1 = res1.getInteger(R.integer.price_adidas_chernie);
        String cenaStr1 = Integer.toString(cena1);
        String price1 = String.format(getString(R.string.price), cenaStr1);
        krosiNike.setText(price1);
    }
}