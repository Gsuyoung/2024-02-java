package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        /*
         자연수 1부터 시작해서 모든 홀수를 더해 나간다.
         그리고 그 합이 언제(몇을 더했을 때) 1,000을
         넘어서는지, 그리고 1,000을 넘어선 값은 얼마가
         되는지 계산하여 출력하는 프로그램을 작성해보자.
         */

        int sum = 0;
        for(int i=1;i<=100;i=i+2) {
            sum = sum + i;
            if(sum > 1000) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);




        System.out.println("--------------");

        int i = 0;
        int odd = 0;
        while(odd < 1000) {
            i++;
            if((i % 2) == 1) { //i값을 2로 나눴을 때 나머지값이 1이면 >> 홀수
                System.out.println("i: " + i);
                odd += i;
            }
        }
        System.out.printf("마지막 더한값: %d\n" , i);
        System.out.println("odd: " + odd);
    }
}