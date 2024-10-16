package com.green.day07.ch11;

public class StringInst {
    public static void main(String[] args) {
        String str1 = new String("Simple String");
        String str2 = "The Best String";

        System.out.println(str1);
        System.out.println(str1.length());//인스턴스메소드. 스태틱이었다면 String.length()로 표현했을 것이다.
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String");
    }
    public static void showString(String str) {
        System.out.println(str);
        System.out.println(str.length());
    }
}
