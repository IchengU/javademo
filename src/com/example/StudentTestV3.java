package com.example;

public class StudentTestV3 {
    public static void main(String[] args) {
        StudentV3 s1=new StudentV3("Tom",100);
        StudentV3 s2=new StudentV3("John",50);
        StudentV3 s3=new StudentV3("Tim",20);
        System.out.println("共统计了："+StudentV3.getCount());
    }
}
