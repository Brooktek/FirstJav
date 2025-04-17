package com.example.firstjav;

import androidx.annotation.NonNull;

public class Drink {

    private String Name;
    private String Description;
    private Integer Photo;


    static final Drink[] drinks = {
      new Drink("cappuccino", "this is sara sp", R.drawable.cappuccino),
      new Drink("latte", "this is brook sp", R.drawable.latte),
      new Drink("filter", "this is tomi sp", R.drawable.filter)
    };

    public Drink(String name, String description, Integer photo) {
        this.Name = name;
        this.Description = description;
        this.Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getPhoto() {
        return Photo;
    }

    public void setPhoto(Integer photo) {
        Photo = photo;
    }

    @NonNull
    @Override
    public String toString() {
        return Name;
    }
}
