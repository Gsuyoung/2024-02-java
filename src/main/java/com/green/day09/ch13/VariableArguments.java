package com.green.day09.ch13;

public class VariableArguments {
    public static void main(String[] args) {
        sum(1,2); //3
        //sum메소드 호출 아규먼트 정수값 2개를 보내고 있다.
        //void 메소드(혼자 있음)
        //클래스 메소드 vs 인스턴스 메소드 : 객체 생성 부분이 없기 때문에 클래스 메소드

        sum(10, 22, 33); //65

        sumVar(1); //[1] --> 1
        sumVar(1,2); //[1,2] --> 3
        sumVar(1,2,3); //[1,2,3] -- > 6
        sumVar(1,2,3,1,2,3); //[1,2,3,1,2,3] --> 12

    }
    static void sumVar(int... values) { //이 문법을 통해서 values라는 배열생성
        //가변인자(같은 타입의 값을 ,,,갯수제한없이 사용가능)
        //배열로 변환되어서 파라미터로 들어온다.

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println(sum);
    }
    static void sum(int n1, int n2) {
        System.out.println("n1 + n2 = " + (n1 + n2));
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println("n1 + n2 + n3 = " + (n1 + n2 + n3));
    }
}