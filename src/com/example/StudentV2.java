package com.example;

public class StudentV2{
    private String name;
    private double score;
    public StudentV2(){
        this("未知",0);
    }
    public StudentV2(String name,double score){
        this.name=name;
        setScore(score);
    }
    public void setScore(double score){
        if(score<0 || score>100){
            System.out.println("输入的成绩不合法，成绩必须在0-100");
        }
        else{
            this.score=score;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public double getScore(){
        return this.score;
    }
    public void showScore(){
        System.out.println(name+":"+score);
    }
}
