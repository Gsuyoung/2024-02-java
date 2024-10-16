package com.green.day06.ch07;

//static이 안붙었으므로 서류에 불과하다.
public class BankAccount {
    int balance = 0; //멤버필드,전역변수

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d\n", balance);
    }
}
