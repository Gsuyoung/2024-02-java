package com.green.day08.ch13;

public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5];
        System.out.println(arr.length);

        Box b1 = new Box("안녕");
        System.out.println(b1); // = System.out.println(b1.toString());

        arr[0] = b1;
        arr[1] = new Box("하세요");
        arr[2] = new Box("반갑습니다");

        System.out.println(arr[0]); //arr[Box객체의 주소값이 저장되어있다.]
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

class Box { //모든 class는 Object한테 상속받는다.
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    @Override
    public String toString() {
        return  conts;
    }
}