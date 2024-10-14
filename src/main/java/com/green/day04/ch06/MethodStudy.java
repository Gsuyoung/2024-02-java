package com.green.day04.ch06;

public class MethodStudy {
    /*
    함수 사용하는 이유 : 유지보수의 효율성을 극대화시키려고
    아래 메소드를 main 메소드라고 부른다.
    메소드를 만드는 행위는 '메소드를 정의했다'고 표현한다.
    만든 메소드를 사용하는 행위를 '메소드를 호출했다'고 표현한다.
    public, static은 나중에 설명

    아래 4가지가 메소드 구성요소
     void : 리턴타입 --> 타입이 없는 언어(자바스크립트) void를 적지않는다.
     (메소드가 호출된 후의 결과값)
     main : 메소드명 (호출할 때 사용)
     (String [] args) : 파라미터, 매개변수 (메소드를 호출할 때 메소드에 보내는 데이터)
     {} : 구현부 (호출되었을 때 실행되는 부분)

     (리턴타입 + 메소드명 + 파라미터) : 선언부

     메소드를 크게 두 분류
     - void 메소드 : 리턴하는 값이 없다. (결과값이 없다.)
      --> 실행커서가 호출한 곳으로 단독으로 돌아간다.
     - return 메소드(비 void) 메소드 : 리턴하는 값이 있다. (결과값이 있다.)

     */

    public static void main(String[] args) {
        sum(5,7); // sum메소드 호출, 메소드에 보내는 값은 아규먼트(인자)
        sum(15,17); // sum메소드 호출
        int result = returnsum(5,7);
        System.out.println("result : " + result);
        System.out.println("result2 : " + returnsum(15,17));
        System.out.println("result2 : " + 32);
    }

    //sum이라는 이름의 static 메소드를 정의했다.(파라미터는 2개)
    static void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    //메소드는 무조건 'return' 키워드가 있어야 데이터가 호출한 곳으로 돌아간다.
    //void는 return을 생략가능. 비void는 return 생략불가능.
    static int returnsum(int n1, int n2) {
        return n1 + n2;
    }
}