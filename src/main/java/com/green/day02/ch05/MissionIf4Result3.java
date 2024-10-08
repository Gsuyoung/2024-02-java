package com.green.day02.ch05;

public class MissionIf4Result3 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);// 0~ 100사이의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        String grade = "D", opt = ""; //opt는 옵션으로 --> D옆에는 아무것도 안붙으므로 ""
        int gradeScore = score / 10;
        // 100 / 10 --> 10
        // 98 / 10 --> 9
        // 88 / 10 --> 8
        // 79 / 10 --> 7

        switch(gradeScore) {
            case 9, 10 :
                grade = "A";
                break;
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
        }
        int optScore = score % 10;
        // 98 % 10 --> 8
        // 88 % 10 --> 8
        // 76 % 10 --> 6
        if(gradeScore > 6) {
            if (gradeScore >= 8 || score == 100) { opt = "+"; } //--> option '+'가 붙는다는 뜻
            else if (gradeScore >= 4) { opt = "0"; }
            else { opt = "-"; }
        }

        System.out.printf("%s%s", grade, opt);
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
        }
    }
