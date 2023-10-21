package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
*/

public class Solution {

    public static void main(String[] args) {
        String emptyString = "";
        String bazooka = "Gomu Gomu no Bazooka!";
        String numbers = emptyString + 2 + 2 + "22";
        int count = emptyString.length();
        int finish = bazooka.length();
        int start = numbers.length();
        System.out.println(emptyString.length());
        System.out.println(bazooka.length());
        System.out.println(numbers.length());
    }
}
