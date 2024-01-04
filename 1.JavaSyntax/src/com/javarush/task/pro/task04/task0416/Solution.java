package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = scanner.nextInt();
        int people = scanner.nextInt();
        double share = bottles * 1.0/ people;
        System.out.println(share);

    }
}