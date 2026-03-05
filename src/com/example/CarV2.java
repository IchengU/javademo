package com.example;

public class CarV2 {
    private String brand;
    private String color;
    private double price;
    public CarV2() {
        this("未知品牌","未知颜色",0.0);
    }
    public CarV2(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        setPrice(price);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Price is negative");
        }
        else {
            this.price = price;
        }
    }
    public void info() {
        System.out.println("品牌："+brand+" 颜色:"+color+" 价格："+price);
    }
}
