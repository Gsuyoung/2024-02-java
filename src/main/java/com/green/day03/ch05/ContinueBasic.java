package com.green.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while((n++) < 100) { //<--(n++먼저 실행되서) 제일 처음 실행되는 n값은 1
            if(((n % 5) != 0) || ((n % 7) != 0)) {
                continue; // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동
            }
            count++; // 5와 7의 배수인 경우만 실행
            System.out.println("n: " + n);
        }
        System.out.println("count: " + count); //결과는 35,70 count:2
    }
}