package com.green.day06.ch07;

import com.green.day05.ch07.BankAccountPO;

public class BankAccountTest {
    public static void main(String[] args) {
        //ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        //제한은 많을 수록 좋다.
        //객체를 만들기위해서는 new 를 사용해야한다.
        BankAccount ba = new BankAccount();
        // BankAccount ba --> 레퍼런스 타입(참조타입)
        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3 = new BankAccount();
        ba3.checkMyBalance(); //balance : 0
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance(); //balance : 39000

        ba.checkMyBalance(); //balance : 3000


        //BankAccount ba2 = new Sring("안녕"); ba2는 String객체 주소값을 담을 수 없다.
        String str = new String("안녕");
    }
}
