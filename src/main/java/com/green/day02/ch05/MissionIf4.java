package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);// 0~ 100사이의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        /*
            100점이면 A+
            98이상이면 A+
            94이상 97이하 A0
            90이상 93이하 A-

            88이상 89이하 B+
            84이상 87이하 B0
            80이상 83이하 B-

            78이상 79이하 C+
            74이상 77이하 C0
            70이상 73이하 C-

            나머지 D
         */

        if (score >= 98 || score > 100) {
            System.out.println("A+");
        } else if (score >= 94 && score <= 97) {
            System.out.println("A0");
        } else if (score >= 90 && score <= 93) {
            System.out.println("A-");
        } else if (score >= 88 && score <= 89) {
            System.out.println("B+");
        } else if (score >= 84 && score <= 87) {
            System.out.println("B0");
        } else if (score >= 80 && score <= 83) {
            System.out.println("B-");
        } else if (score >= 78 && score <= 79) {
            System.out.println("C+");
        } else if (score >= 74 && score <= 77) {
            System.out.println("C0");
        } else if (score >= 70 && score <= 73) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }

        char grade = 'D', opt = '0';

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) { opt = '+';}
            else if (score < 94) { opt = '-';}
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) { opt = '+'; }
            else if (score < 84) { opt = '-';}
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) { opt = '+'; }
            else if (score < 74) { opt = '-'; }
        } else { opt = 'D'; }
            System.out.printf("%c%c\n", grade, opt);

        }
    }
