package com.green.practice;

import java.util.Scanner;

public class zzzzzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇?");
        int n = scan.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("ㅋ");
            }System.out.println();
        }
    }
}