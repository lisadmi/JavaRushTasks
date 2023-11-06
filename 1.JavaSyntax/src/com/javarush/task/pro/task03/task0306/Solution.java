package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();

       boolean flag1 = (a + b) > c ;
       boolean flag2 = (b + c) > a;
       boolean flag3 = (a + c) > b;

       if (flag1 && flag2 && flag3){
           System.out.println(TRIANGLE_EXISTS);
       }
       else {
           System.out.println(TRIANGLE_NOT_EXISTS);
       }
    }
}
