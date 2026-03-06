package com.example;

public class StudentV3 {
    private static int count;
    private String name;
    private int score;
    public StudentV3(String name, int score) {
        this.name = name;
        this.score = score;
        count++;
    }
    public static int getCount() {
        return count;
    }
}
