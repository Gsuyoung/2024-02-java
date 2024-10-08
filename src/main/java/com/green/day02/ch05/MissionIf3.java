package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scan.nextInt();

        if(input % 2 == 0) {
            System.out.println(input + "는(은) 짝수입니다. ");
        } else {
            System.out.println(input + "는(은) 홀수입니다. ");
        }

        System.out.printf("%d는(은) %c수입니다.\n",
                input, (input % 2 == 0 ? '짝': '홀')); // 결과타입은 문자(character type)

        //11는(은) 홀수입니다.

        //14는(은) 짝수입니다.

        System.out.println("---- 끝 ----");

    }
}
