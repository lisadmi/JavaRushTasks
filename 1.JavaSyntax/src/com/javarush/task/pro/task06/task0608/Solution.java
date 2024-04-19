package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static long cube(long a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        long result = cube(7);
        System.out.println(result);

    }


}
