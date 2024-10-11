package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.
         A B
        +B A
        ------
         9 9
         */

        for(int A=0;A<=9; A++) {
            for(int B=0;B<=9; B++) {
                if(A + B == 9) {
                    System.out.printf("[%d,%d]\n",A,B);
                }
            }
        }
    }
}