package com.example.asus.norouzi;


public class Phone {
    public String phoneName;
    public int imageResource;
    public String AboutPhone;

    public Phone(String id, int imageResource, String AboutPhone) {
        this.phoneName = id;
        this.imageResource = imageResource;
        this.AboutPhone = AboutPhone;
    }

    @Override
    public String toString() {
        return phoneName;
    }
}
