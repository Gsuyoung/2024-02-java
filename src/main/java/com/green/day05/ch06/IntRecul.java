package com.green.day05.ch06;

public class IntRecul {
    public static void main(String[] args) {
        showHi(3);
    }
    public static void showHi(int cnt) {
        System.out.println("Hi ~~ ");
        if(cnt == 1) {
            return;
        }
        //showHi(cnt--); //x --가 뒤에 있어서 계속 3만 보내므로
        //showHi(--cnt); o
        showHi(cnt -1 ); //o
    }
}
