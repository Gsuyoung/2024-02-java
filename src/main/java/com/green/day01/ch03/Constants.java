package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;
        String str = "상중하";

        CONST_ASSIGNED = 12;

        System.out.printf(" 상수1: %d\n 상수2: %c\n 상수3: %d\n 상수4: %s\n", MAX_SIZE, CONST_CHAR, CONST_ASSIGNED, str);

        System.out.println("---------------------");

        System.out.printf(" 상수1: %d\n", MAX_SIZE);
        System.out.printf(" 상수1: 100\n");

        System.out.printf(" 상수2: %c\n", CONST_CHAR);
        System.out.printf(" 상수2: 상\n");

        System.out.printf(" 상수3: %d\n", CONST_ASSIGNED);
        System.out.printf(" 상수3: 12\n");

        System.out.printf(" 상수4: %s\n", str);
        System.out.printf(" 상수4: 상중하\n");

    }
}
