package com.example;

import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double num1 = sc.nextDouble();
          char operator = sc.next().charAt(0);
          double num2 = sc.nextDouble();
          if(operator == '+'){
              System.out.println(num1 + num2);

          }
          else if(operator == '-'){
              System.out.println(num1 - num2);
          }
          else if(operator == '*'){
              System.out.println(num1 * num2);
          }
          else if(operator == '/'){
              if(num2 == 0){
                  System.out.println("Division by zero");

              }
              else{
                  System.out.println(num1 / num2);
              }
          }
          sc.close();
      }
}
