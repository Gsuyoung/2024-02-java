package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;

        //처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
        while(n < 100) {
            if(((n % 5) == 0) && ((n % 7) == 0)) {
                search = true;
                break; //while문 탈출
            }
            n++;
        }
        if(search) {
            System.out.printf("찾는 정수: %d\n", n);
        } else {
            System.out.println("못 찾음");
        }
    }
}