package com.example.paint;

public class Model {
    private String imageUrl;
    private String textLat;
    private String textLong;
    private String textAddress;

    public Model() {

    }

//    public Model(String imageUrl, String textLat, String textLong, String textAddress) {
    public Model(String imageUrl, String textLat, String textLong) {
        this.imageUrl = imageUrl;
        this.textLat = textLat;
        this.textLong = textLong;
//        this.textAddress = textAddress;
    }

    public String getTextLat() {
        return textLat;
    }

    public void setTextLat(String textLat) {
        this.textLat = textLat;
    }

    public String getTextLong() {
        return textLong;
    }

    public void setTextLong(String textLong) {
        this.textLong = textLong;
    }

    public String getTextAddress() {
        return textAddress;
    }

    public void setTextAddress(String textAddress) {
        this.textAddress = textAddress;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
