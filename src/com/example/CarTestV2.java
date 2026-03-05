package com.example;

public class CarTestV2 {
    public static void main(String[] args) {
        CarV2 c1 = new CarV2();
        c1.info();
        CarV2 c2 = new CarV2("宝马","白色",10000);
        c2.info();
        CarV2 c3 = new CarV2("奥迪","黑色",-500);
        c3.info();
        c1.setBrand("大众");
        c1.setColor("银色");
        c1.setPrice(150000);
        c1.info();
    }
}
