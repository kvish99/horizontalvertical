package com.example.horizontalvertical.Model;

public class FoodMenu {

    String foodname;

    int foodimage;

    public FoodMenu(String foodname, int foodimage) {
        this.foodname = foodname;
        this.foodimage = foodimage;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }
}
