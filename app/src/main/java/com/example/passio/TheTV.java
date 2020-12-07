package com.example.passio;

public class TheTV {
    private String noidung;
    private  String time;
    private  int image;

    public TheTV(String noidung, String time, int image) {
        this.noidung = noidung;
        this.time = time;
        this.image = image;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
