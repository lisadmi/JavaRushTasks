package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
//        int count = 0;
//       char[] charStr = string.toCharArray();
//        for (int i = 0; i < charStr.length; i++) {
//            char aChar = charStr[i];
//            if (Character.isDigit(aChar)){
//                count++;
//            }
//        }
//        return count;


        int count = 0;
        for (char aChar : string.toCharArray()) {
            if (Character.isDigit(aChar)){
                count++;
            }
        }
        return count;


    }

    public static int countLetters(String string) {
        int count = 0;
        char[] charStr = string.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            char aChar = charStr[i];
            if(Character.isLetter(aChar)){
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] charStr = string.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            char aChar= charStr[i];
            if (Character.isSpaceChar(aChar)){
                count++;
            }
        }
        return count;
    }
}
