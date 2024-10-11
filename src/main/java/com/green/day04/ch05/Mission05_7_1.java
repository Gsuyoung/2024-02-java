package com.green.day04.ch05;

//p.135
public class Mission05_7_1 {
    public static void main(String[] args) {
       /*
       1번. 구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되
       2단은 2 x 2까지, 4단은 4 x 4까지, 6단은 6 x 6까지, 8단은 8 x 8까지
       출력하도록 작성하자.
        */

        for (int i=2; i<9; i+=2) {
            for (int j=1; j<9; j++) {
                if (i>=j) {
                    System.out.printf("%d x %d = %d\n", i, j, (i * j));
                }
            }
            System.out.println();
        }
        System.out.println("--------------");

        for (int i = 2; i <= 8; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }
}