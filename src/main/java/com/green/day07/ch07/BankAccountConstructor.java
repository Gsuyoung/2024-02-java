package com.green.day07.ch07;

class BankAccount2 {
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private int balance;

    /*
    생성자는 메소드의 한 종류
    메소드와 다른점 2가지 (정의했을 때)
    1. 이름이 클래스명과 같다.
    2. 반환형(리턴타입)을 작성하지 않는다.

    생성자는 객체 생성할때만 호출할 수 있다.
    객체생성 이후에는 호출 불가

    생성자를 작성하지 않으면 기본 생성자가 자동으로 만들어진다.
    그러나 생성자를 하나라도 작성하게되면 기본 생성자는 만들어지지않는다.
    기본생성자와 파라미터가 있는 생성자 둘 다를 만들고 싶을때는 기본생성자를 따로 정의해주어야한다.

    오버로딩(Overloading) : 같은 이름의 메소드를 여러개 만들 수 있는 기법(파라미터가 다르면 가능)

    생성자를 사용하는 이유 : 기본생성자의 값을 초기화하기위해서

    객체에서 값을 초기화하는 생성자는 있지만 setter가없을때의도한 이유 : 상수화하고싶어서
    더이상 값을 바꿀 수 없기때문에
     */
    //기본 생성자 모습
    BankAccount2() {
        super();//생략 가능
    }

    //파라미터가 있는 생성자 or 오버로딩된 생성자
    BankAccount2(String acc, String ss, int bal) { //생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    void initAccount(String acc, String ss, int bal) { //메소드
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("계좌번호: %s\n", accNumber);
        System.out.printf("주민번호: %s\n", ssNumber);
        System.out.printf("잔   액: %d\n", balance);
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {
        /*
        객체 생성된 new 키워드 우측에 적는 것은 생성자 호출이다.
        모든 객체지향언어는 객체를 생성할 때 생성자를 호출해야한다.
         */
        BankAccount2 ba1 = new BankAccount2(); //기본생성자 호출
        ba1.checkMyBalance(); //deport값은 null/null/0

        //파라미터가 있는 생성자 호출 or 오버로딩된 생성자 호출
        BankAccount2 ba2 = new BankAccount2("111-222", "990909-1778888", 10000);
        ba2.checkMyBalance();
    }
}
