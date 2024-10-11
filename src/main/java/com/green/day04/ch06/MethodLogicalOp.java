package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 11;
        boolean b = LogicalOp1(n1);
        System.out.println("b = " + b);
        //값이 1이상 100이하라면 true, 아니라면 false

        boolean b2 = LogicalOp2(n1);
        System.out.println("b2 = " + b2);
        //2의 배수이거나 3의 배수이면 true 아니면 false
    }
    static boolean LogicalOp1(int n1) {
        return (n1 >= 1 && n1 <=100);
    }
    static boolean LogicalOp2(int n2) {
        return (n2 % 2 == 0) || (n2 % 3 == 0) ;
    }
}
