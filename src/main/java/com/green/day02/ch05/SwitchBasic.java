package com.green.day02.ch05;

public class SwitchBasic {
    public static void main(String[] args) {
        int n = 3;
        switch(n) {
            case 1:
                System.out.println("Simple Java");
            case 2:
                System.out.println("Funny Java");
            case 3:
                System.out.println("Fantastic Java");
            default:
                System.out.println("The best programming Language");
        }
        System.out.println("Do you like Java?");
    }
}
