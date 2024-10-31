package com.green.day16.ch26;
//p.653 익명 클래스
/*
    익명 클래스는 interface를 implements한 클래스를 만들지 않고
    다이렉트로 interface를 implements한 클래스를 객체화 할 때 사용할 수 있다.
    즉, 코드 작성을 많이 생략 할 수 있다.
    익명 클래스는 추상메소드 갯수와는 상관이없다.
    익명 클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.
    람다식을 작성할 수 있는 interface는 오로지 추상메소드 하나만 가지고 있는 경우에만 가능하다.
    그래서 보통 람다식을 사용하는 interface는 @FunctionalInterface 애노테이션이 붙어있다.
    이 애노테이션은 2개의 추상메소드를 가지고 있으면 컴파일에러를 발생시킨다.
    consumer - void와 파라미터만 있는것
    supplier - 파라미터 없이 return만 있는 것
 */
public class UseAnonymousInner {
    public static void main(String[] args) {
        //익명 클래스 : 여러가지 객체화 할 필요없이 사용할 수 있다.
        Printable p = new Printable() {
            //Printable을 객체화한 것이 아니고 Printable을 implements한 class를 객체화한 것
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        };

        //람다식
        //추상메소드 하나만 가지고 있는 interface만 람다식을 사용할 수 있다.
        /*
            인터페이스(Printable) 파라미터가 없으므로 () 람다식 시작한다( -> )
            {} 중괄호 생략 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
        */
        Printable p2 = () -> {
            System.out.println("람다 print");
        };

        p.print();
        p2.print();
    }
}
//인터페이스는 객체화 불가능 : 인터페이스는 추상메소드밖에 가질 수 없다.
//구현부가 없으므로 객체화가 되더라도 쓸모가없으므로 막아놨다.
@FunctionalInterface //추상메소드 하나만 가질 수 있게 한다.
                     //왜 하나만 가지게 했는가? : 람다식을 표현하게 하고싶어서
interface Printable {
    void print();
    //void print2();
}