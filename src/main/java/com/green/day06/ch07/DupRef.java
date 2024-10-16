package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //객체의 주소값이 복사된다.(얕은 복사 Shallow Copy) <-> 깊은복사(deep copy)

        ba1.deposit(1000);
        ba2.checkMyBalance(); //1000

        //BankAccount ba1이 의미하는 바는
        //참조변수, 변수명 ba1, 주소값 저장
        //BankAcoount객체 주소값만!! 저장 가능 --> 중요!
    }
}
