package com.green.day02.ch05;

public class IEIE2 {
    public static void main(String[] args) {
        int n = 120;

        if (n < 0) {
            System.out.printf("%d은 0 미만\n", n);
        } else {
            if (n < 50) {
                System.out.printf("%d은 50 미만\n", n);
            } else if (n < 100) {
                System.out.printf("%d은 100 미만\n", n);
            } else {
                System.out.printf("%d은 100 이상\n", n);
            }

            System.out.println(" --- 끝 --- ");
        }
    }
}
