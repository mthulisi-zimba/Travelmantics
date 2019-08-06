package com.example.travelmantics.models;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String Description;
    private String price;
    private String imageUrl;

    private String imageName;

    public  TravelDeal(){}

    public TravelDeal(String title, String description, String price, String imageUrl, String imageName) {
        this.setId(id);
        this.setTitle(title);
        Description = description;
        this.setPrice(price);
        this.setImageUrl(imageUrl);
        this.setImageName(imageName);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
