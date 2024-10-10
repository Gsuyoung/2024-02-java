package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.
         */

        for(int dan =1; dan<10; dan++){
            for(int i=2;i<10; i++){
                System.out.printf("%d x %d = %d\t" ,i, dan, (dan*i));

            }
            System.out.println();
        }
    }
}
