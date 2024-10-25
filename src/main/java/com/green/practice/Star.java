package com.green.practice;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < star - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = star - 1; i >= 0; i--) {
            for (int j = 0; j < star - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}