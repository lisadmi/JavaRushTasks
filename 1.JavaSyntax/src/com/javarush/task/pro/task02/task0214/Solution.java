package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOne = scanner.nextLine();
        String stringTwo = scanner.nextLine();
        String stringThree = scanner.nextLine();

        System.out.println(stringThree);
        System.out.println(stringTwo.toUpperCase());
        System.out.println(stringOne.toLowerCase());

    }
}
