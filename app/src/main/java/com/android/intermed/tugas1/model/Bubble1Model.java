package com.android.intermed.tugas1.model;

/**
 * Created by aqiseu on 3/22/2017.
 */

import java.io.Serializable;

public class Bubble1Model implements Serializable {

    String title, harga;
    int image;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}