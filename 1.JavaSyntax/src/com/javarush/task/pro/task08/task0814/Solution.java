package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {

        return number| (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {

        return number & ~ (1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {

        return (number & (1<<flagPos))  == (1<<flagPos);
    }

    public static void main(String[] args) {
        System.out.println(setFlag(16,2));
        System.out.println(resetFlag(20,2));

    }
}
