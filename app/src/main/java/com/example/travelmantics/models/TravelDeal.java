package com.example.travelmantics.models;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String Description;
    private String price;
    private String imageUrl;

    public  TravelDeal(){}
    public TravelDeal(String title, String description, String price, String imageUrl) {
        this.id = id;
        this.title = title;
        Description = description;
        this.price = price;
        this.imageUrl = imageUrl;
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
}
