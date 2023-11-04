package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isYoung = (age <= 60)||(age > 20);
        boolean isOld =  (age < 20)||(age > 60);
        if (!isYoung || isOld)
        System.out.println("можно не работать");
    }
}
