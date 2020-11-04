package com.demo.clothingstore;

import androidx.annotation.NonNull;

public class Clothe {
    private String title;
    private String info;
    private int resId;
    private int choose;


    public Clothe(String title, String info, int resId, int choose) {
        this.title = title;
        this.info = info;
        this.resId = resId;
        this.choose = choose;

    }

    public String getTitle() {
        return title;
    }

    public int getResId() {
        return resId;
    }
    public int getChoose() {
        return choose;
    }

    public String getInfo() {
        return info;
    }


    @NonNull
    @Override
    public String toString() {
        return title;
    }


    }
