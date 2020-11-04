package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class hudiRpndpInfo extends AppCompatActivity {
    private ImageView imageInfo;
    private ImageView choose1;
    private ImageView choose2;
    private TextView nameInfo;
    private TextView info;
    private ArrayList<Clothe> hudi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hudi_rpndp_info);
        imageInfo = findViewById(R.id.imageInfo);
        choose1 = findViewById(R.id.choose1);
        choose2 = findViewById(R.id.choose2);
        nameInfo = findViewById(R.id.nameInfo);
        info = findViewById(R.id.info);

        hudi1 = new ArrayList<>();
        hudi1.add(new Clothe(getString(R.string.hoodi_rpndp), getString(R.string.hoodi_rpndp_info), R.drawable.hudi_rpndp, 0));
        Clothe clothe = hudi1.get(0);
        String title = clothe.getTitle();
        String infoo = clothe.getInfo();
        int resId = clothe.getResId();
        int choose = clothe.getChoose();
        imageInfo.setImageResource(resId);
        nameInfo.setText(title);
        info.setText(infoo);

        if (choose == 0){
            choose1.setVisibility(View.INVISIBLE);
            choose2.setVisibility(View.INVISIBLE);
        }



    }
}