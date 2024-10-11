package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        /*
        star = 3
        *
        **
        ***

        star = 4
        *
        **
        ***
        ****
         */

        int star = (int)(Math.random() * 6.0 + 3);
        System.out.println("star 값은? " + star);

        for(int i=0;i<star;i++) { //바깥for문 --> 줄 담당
            for(int j=0;j<=i;j++) { //안쪽for문
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
