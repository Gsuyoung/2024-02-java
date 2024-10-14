package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        result = adder(4, 5); //9 리턴
        System.out.println("4 + 5 = " + result);
    }
    static int adder(int n1,int n2) {
        return(n1+n2);
    }
}
