package com.example;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c=new Car();
        System.out.println("请输入车的品牌，颜色，价格");
        c.brand=sc.nextLine();
        c.color=sc.nextLine();
        c.price=sc.nextDouble();
        c.info();
    }
}
