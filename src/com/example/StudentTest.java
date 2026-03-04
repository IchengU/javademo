package com.example;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入有几个学生：");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("第"+i+"个学生(name score):");
            String name=sc.next();
            double score=sc.nextDouble();
            s.name=name;
            s.score=score;
            s.hello();
            s.showScore();
        }
    }
}
