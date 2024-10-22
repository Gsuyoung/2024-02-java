package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC classc = new ClassC(); //== new ClassC();

        }
    }
//ClassC는 ClassB를 상속
//ClassB는 ClassA를 상속
//super()은 자식 생성자 코드에서 최상위에 위치해야 한다.
//다중상속은 불가능
class ClassA {
    public ClassA() {
        super();
        System.out.println("==== ClassA ====");
    }
}

class ClassB extends ClassA{
    public ClassB() {
        super();
        System.out.println("==== ClassB ====");

    }
}

class  ClassC extends ClassB{
    public ClassC() {
        super();
        System.out.println("==== ClassC ====");
    }
}