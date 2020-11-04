package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hoodi extends AppCompatActivity {

    private TextView hudiRpndp;
    private TextView hudiNike;
    private TextView hudiSprm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoodi);
        hudiRpndp = findViewById(R.id.hudiRpndpPrice);
        Resources res = getResources();
        int cena = res.getInteger(R.integer.price_adidas_chernie);
        String cenaStr = Integer.toString(cena);
        String price = String.format(getString(R.string.price), cenaStr);
        hudiRpndp.setText(price);

        hudiNike = findViewById(R.id.hudiNikePrice);
        Resources res1 = getResources();
        int cena1 = res1.getInteger(R.integer.price_adidas_chernie);
        String cenaStr1 = Integer.toString(cena1);
        String price1 = String.format(getString(R.string.price), cenaStr1);
        hudiNike.setText(price1);

        hudiSprm = findViewById(R.id.hudiSprmPrice);
        Resources res2 = getResources();
        int cena2 = res2.getInteger(R.integer.price_adidas_chernie);
        String cenaStr2 = Integer.toString(cena2);
        String price2 = String.format(getString(R.string.price), cenaStr2);
        hudiSprm.setText(price2);
    }
    public void hudiRpndpInfo(View view) {
        Intent intent = new Intent(this, hudiRpndpInfo.class);
        startActivity(intent);
    }

    public void hudiNikeInfo(View view) {
        Intent intent1 = new Intent(this, hudiNikeInfo.class);
        startActivity(intent1);
    }
}
