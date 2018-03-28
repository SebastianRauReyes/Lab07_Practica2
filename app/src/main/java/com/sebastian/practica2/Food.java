package com.sebastian.practica2;

/**
 * Created by Alumno on 27/03/2018.
 */

public class Food {

    private String picture;
    private String name;
    private String time;
    private String price;

    public  Food(String picture,String name, String time, String price){
        this.picture = picture;
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
