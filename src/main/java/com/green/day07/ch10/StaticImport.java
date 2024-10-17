package com.green.day07.ch10;

import static java.lang.Math.*; //*은 all의 의미가 있다.
//Math 클래스 아래에 있는 static 멤버필드, 멤버메소드 전부 import하라는 의미
//TDD하게 되면 사용한다.

public class StaticImport {
    public static void main(String[] args) {
        /*
        원래는 아래처럼 작성을 해야하지만,
        System.out.println( Math.E );
        //메소드가 아닌 멤버필드 : 소괄호가 없으므로 , E = 대문자이므로 상수, 객체화없이 사용했으므로 static

        System.out.println( Math.random() );//리턴메소드다(감싸져있기때문에), 더블타입

        static import 선언을 하면
        아래처럼 표기할 수 있다.
         */
        System.out.println( E );
        System.out.println( random() );
    }
}
