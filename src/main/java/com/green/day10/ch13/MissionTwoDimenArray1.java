package com.green.day10.ch13;

public class MissionTwoDimenArray1 {
    public static void main(String[] args) {
       /*
        int[][] score = {
                //국어, 영어, 수학, 사회 점수
                {100, 90, 80, 10}, //영수
                {90, 90, 80, 20}, //상철
                {80, 70, 60, 30}, //광수
                {90, 75, 66, 40}, //민우
        };

        영수: 합계점수, 평균점수
        상철: 합계점수, 평균점수
        광수: 합계점수, 평균점수
        국어: 합계점수, 평균점수
        영어: 합계점수, 평균점수
        수학: 합계점수, 평균점수
        학급: 합계점수, 평균점수
         */

        Students[] arr = new Students[4];
        arr[0] = new Students("영수",100, 90, 80, 10);
        arr[1] = new Students("상철",90, 90, 80, 20);
        arr[2] = new Students("광수",80, 70, 60, 30);
        arr[3] = new Students("민우",90, 75, 66, 40);

        Students first = arr[0];
        Students second = arr[1];
        Students third = arr[2];
        Students forth = arr[3];

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println(forth.toString());

        System.out.println("-----------------------------");

        totallanguage(arr);
        totalmath(arr);
        totalenglisth(arr);
        totalhistory(arr);

        System.out.println("==============================");

        totalstudent(arr);
    }


    public static void totallanguage(Students[] student) {
        int total = 0;
        for(Students item : student) {
            total += item.getLanguages();
        }
        float average = (float)total / student.length;
        System.out.printf("국어 - 합계점수 %d, 평균점수 %.1f\n",total,average);
    }

    public static void totalmath(Students[] student) {
        int total = 0;
        for(Students item : student) {
            total += item.getMath();
        }
        float average = (float)total / student.length;
        System.out.printf("수학 - 합계점수 %d, 평균점수 %.1f\n",total,average);
        }

        public static void totalenglisth(Students[] student) {
        int total = 0;
        for(Students item : student) {
            total += item.getEnglish();
        }
        float average = (float)total / student.length;
            System.out.printf("영어 - 합계점수 %d, 평균점수 %.1f\n",total,average);
        }

        public static void totalhistory(Students[] student) {
        int total = 0;
        for(Students item : student){
            total += item.getHistory();
        }
        float average = (float)total / student.length;
            System.out.printf("사회 - 합계점수 %d, 평균점수 %.1f\n",total,average);
        }

        public static void totalstudent(Students[] student) {
        int total = 0;
        for(Students item : student) {
            total += item.Sum();
        }
        float average = (float)total / student.length * Students.length;
            System.out.printf("학급 - 합계점수 %d, 평균점수 %.1f\n",total,average);
        }
    }

class Students {
    public static int length = 3;
    String name;
    int languages;
    int english;
    int math;
    int history;

     public Students(String name, int languages, int english, int math, int history) {
        this.name = name;
        this.languages = languages;
        this.english = english;
        this.math = math;
        this.history = history;
    }

    public String getName() {
         return name;
    }

    public int getLanguages() {
         return  languages;
    }

    public int getEnglish() {
         return english;
    }

    public int getMath() {
        return math;
    }

    public int getHistory() {
        return history;
    }

    public int Sum() {
         return languages + english + math + history;
    }

    public String toString() {
         int totalScore = Sum();
         return String.format("%s - 국어: %d, 영어: %d, 수학: %d, 사회: %d | 합계점수: %d, 평균점수: %.1f",
                 name, languages, english, math, history, totalScore, (float)totalScore / length);
    }
}