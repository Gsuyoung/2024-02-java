package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5); //*****
        System.out.println();
        printStar(2); //**
    }
    static void printStar(int n) {
        for(int i=1; i<=n; i++)
        System.out.print("*");
    }
}
