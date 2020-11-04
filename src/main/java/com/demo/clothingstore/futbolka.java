package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class futbolka extends AppCompatActivity {
    private TextView futbTnf;
    private TextView futbNike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbolka);
        futbTnf = findViewById(R.id.futbTnfPrice);
        Resources res = getResources();
        int cena = res.getInteger(R.integer.price_adidas_chernie);
        String cenaStr = Integer.toString(cena);
        String price = String.format(getString(R.string.price), cenaStr);
        futbTnf.setText(price);

        futbNike = findViewById(R.id.futbNikePrice);
        Resources res1 = getResources();
        int cena1 = res1.getInteger(R.integer.price_adidas_chernie);
        String cenaStr1 = Integer.toString(cena1);
        String price1 = String.format(getString(R.string.price), cenaStr1);
        futbNike.setText(price1);
    }
}