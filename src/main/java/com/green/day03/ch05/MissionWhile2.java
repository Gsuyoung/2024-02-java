package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1~100까지 출력,
        100~1까지 출력

        do-while, while 각 한번씩 사용하여 해결해주세요.
         */

        int n = 1;
        while(n <= 100) {
            System.out.println(n++);
        }

        System.out.println("--------------------");

        do {
            System.out.println(--n);
        }  while(n > 1);
    }
}
