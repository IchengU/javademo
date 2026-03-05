package com.example;

public class StudentTestV2 {
    public static void main(String[] args) {
        StudentV2 s1 = new StudentV2();
        s1.showScore();
        StudentV2 s2 = new StudentV2("Tom",95);
        s2.showScore();
        StudentV2 s3 = new StudentV2("Tim",105);
        s3.showScore();
        s1.setName("anny");
        s1.setScore(100);
        s1.showScore();
    }
}
