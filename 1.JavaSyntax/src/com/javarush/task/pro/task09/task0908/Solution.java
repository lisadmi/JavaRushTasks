package com.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BINARY = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        StringBuilder hexNumber = new StringBuilder();
        for (int i = 0; i <binaryNumber.length() ; i=i+4) {
            String forBit = binaryNumber.substring(i,i+4);
            int index = Arrays.binarySearch(BINARY,forBit);
            char charAt = HEX.charAt(index);
            hexNumber.append(charAt);
        }


        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char charAt = hexNumber.charAt(i);
            int index = HEX.indexOf(charAt);
            String forBit = BINARY[index];
            binaryNumber.append(forBit);
        }

        return binaryNumber.toString();
    }

    public static String toHex1(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String hexNumber = "";
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String fourBit = binaryNumber.substring(i, i + 4);
            String oneHex = "";
            if (fourBit.equals("0000")) {
                oneHex = "0";
            } else if (fourBit.equals("0001")) {
                oneHex = "1";
            } else if (fourBit.equals("0010")) {
                oneHex = "2";
            } else if (fourBit.equals("0011")) {
                oneHex = "3";
            } else if (fourBit.equals("0100")) {
                oneHex = "4";
            } else if (fourBit.equals("0101")) {
                oneHex = "5";
            } else if (fourBit.equals("0110")) {
                oneHex = "6";
            } else if (fourBit.equals("0111")) {
                oneHex = "7";
            } else if (fourBit.equals("1000")) {
                oneHex = "8";
            } else if (fourBit.equals("1001")) {
                oneHex = "9";
            } else if (fourBit.equals("1010")) {
                oneHex = "a";
            } else if (fourBit.equals("1011")) {
                oneHex = "b";
            } else if (fourBit.equals("1100")) {
                oneHex = "c";
            } else if (fourBit.equals("1101")) {
                oneHex = "d";
            } else if (fourBit.equals("1110")) {
                oneHex = "e";
            } else if (fourBit.equals("1111")) {
                oneHex = "f";
            }
            hexNumber = hexNumber + oneHex;
        }

        return hexNumber;
    }

    public static String toBinary1(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourBit = "";
            if (oneHex.equals("0")) {
                fourBit = "0000";
            } else if (oneHex.equals("1")) {
                fourBit = "0001";
            } else if (oneHex.equals("2")) {
                fourBit = "0010";
            } else if (oneHex.equals("3")) {
                fourBit = "0011";
            } else if (oneHex.equals("4")) {
                fourBit = "0100";
            } else if (oneHex.equals("5")) {
                fourBit = "0101";
            } else if (oneHex.equals("6")) {
                fourBit = "0110";
            } else if (oneHex.equals("7")) {
                fourBit = "0111";
            } else if (oneHex.equals("8")) {
                fourBit = "1000";
            } else if (oneHex.equals("9")) {
                fourBit = "1001";
            } else if (oneHex.equals("a")) {
                fourBit = "1010";
            } else if (oneHex.equals("b")) {
                fourBit = "1011";
            } else if (oneHex.equals("c")) {
                fourBit = "1100";
            } else if (oneHex.equals("d")) {
                fourBit = "1101";
            } else if (oneHex.equals("e")) {
                fourBit = "1110";
            } else if (oneHex.equals("f")) {
                fourBit = "1111";
            }
            binaryNumber = binaryNumber + fourBit;
        }
        return binaryNumber;
    }
}
