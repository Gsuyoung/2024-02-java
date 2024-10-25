package com.green.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int scan = scanner.nextInt();
            if (scan == 0) {
                break;
            }
            count++;
            sum += scan;
        }
        System.out.printf("합계는 %d입니다. 평균은 %d입니다.\n", sum, sum / count);
    }
}
