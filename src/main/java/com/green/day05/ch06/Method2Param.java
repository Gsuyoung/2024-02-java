package com.green.day05.ch06;

//parameter(매개변수) --> 갯수의 제한이 없다.
public class Method2Param {
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5); //메소드를 호출했다.(사용하는 부분)
        /*
        제 나이는 12세 입니다.
        저의 키는 12.5cm 입니다.
         */
        hiEveryone(13, myHeight);
        /*
        제 나이는 13세 입니다.
        저의 키는 175.9cm 입니다.
         */
        byEveryone();
        byEveryone();
        //다음에 뵙겠습니다.
    }

    static void hiEveryone(int age, double height) {
        System.out.printf("제 나이는 %d세 입니다.\n저의 키는 %.1fcm 입니다.\n",age,(float)height); //메소드를 정의했다.(만든부분)
    }
    static void byEveryone() {
        System.out.println("다음에 뵙겠습니다.");
    }
}