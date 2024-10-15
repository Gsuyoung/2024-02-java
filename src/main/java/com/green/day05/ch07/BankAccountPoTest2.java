package com.green.day05.ch07;

import com.green.day06.ch07.BankAccount;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        //static이 있을때는 객체화와 상관이없으므로 new를 사용하지 않는다.
        //static이 붙으면 할당받는 메모리(저장공간)이 하나이므로 값이 같다.
        BankAccountPO po1 = new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance(); //1000

        BankAccountPO po2 = new BankAccountPO();
        po2.checkMyBalance(); //1000

        BankAccountPO.checkMyBalance();
    }
}
