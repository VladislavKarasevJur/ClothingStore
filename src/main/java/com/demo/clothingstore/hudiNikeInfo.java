package com.demo.clothingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class hudiNikeInfo extends AppCompatActivity {
    private ImageView imageInfo1;
    private ImageView choose11;
    private ImageView choose21;
    private TextView nameInfo1;
    private TextView info1;
    private ArrayList<Clothe> hudi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        imageInfo1 = findViewById(R.id.imageInfo1);
        choose11 = findViewById(R.id.choose11);
        choose21 = findViewById(R.id.choose21);
        nameInfo1 = findViewById(R.id.nameInfo1);
        info1 = findViewById(R.id.info1);

        hudi1 = new ArrayList<>();
        hudi1.add(new Clothe(getString(R.string.hoodi_nike_zelenoe), getString(R.string.hoodi_nike_zelenoe_info), R.drawable.hudi_zelenoe,0));
        Clothe clothe = hudi1.get(0);
        String title = clothe.getTitle();
        String infoo = clothe.getInfo();

        int resId = clothe.getResId();
        int choose = clothe.getChoose();
        imageInfo1.setImageResource(resId);
        nameInfo1.setText(title);
        info1.setText(infoo);


        if (choose == 0){
            choose11.setVisibility(View.INVISIBLE);
            choose21.setVisibility(View.INVISIBLE);
        }



    }
}