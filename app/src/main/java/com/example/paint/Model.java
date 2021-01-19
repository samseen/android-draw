package com.example.paint;

public class Model {
    private String imageUrl;
    private String textLatLong;
    private String textAddress;

    public Model() {

    }

    public Model(String imageUrl, String textLatLong, String textAddress) {
        this.imageUrl = imageUrl;
        this.textLatLong = textLatLong;
        this.textAddress = textAddress;
    }

    public String getTextLatLong() {
        return textLatLong;
    }

    public void setTextLatLong(String textLatLong) {
        this.textLatLong = textLatLong;
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
