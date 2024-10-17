package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        //System.abc.kkk().ggg

        //System.abc의 결과물을 "A" 지칭하자
        //A.kkk().ggg

        //A.KKK() 의 결과물을 "B" 지칭하자

        //B.ggg

        //System : 클래스
        //abc : 참조변수, 멤버필드
        //kkk() : abc가 가리키고 있는 객체의 메소드, 리턴타입은 참조타입 (void였다면 뒤에 .을 붙일 수 없다)
        //ggg : kkk()메소드가 리턴하는 객체의 멤버필드

        System.out.println();

        PrintStream out = System.out;
        out.println();

        //System : 클래스(대문자로 시작)
        //out : static final 멤버필드, PrintStream 객체의 주소값을 담을 수 있다.(레퍼런스변수이기때문에)
        //println(): 메소드 --> PrintStream이라는 객체안에 out의 주소값

        /*
        PrintStream은 println(int i), println(char c), println(String str) 등의
        메소드를 가지고 있고 이것은 오버로딩이다.
        만약 오버로딩이 없다면,
        println(int i), println(char c), println(String str) 이런식으로 메소드를 만들어야만 한다.
         */
    }
}
