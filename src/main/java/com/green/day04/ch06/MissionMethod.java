package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5); //*****
        System.out.println();
        printStar(2); //**
        System.out.println("---------------");
        printStarSquare(4);
        //****
        //****
        //****
        //****
        System.out.println("---------------");
        printStarTriangle(4);
        //*
        //**
        //***
        //****
    }
    static void printStar(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStarSquare(int n1) {
        for(int i=0;i<n1;i++) {
            for(int j=0;j<n1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for(int i=0;i<n1;i++) {
            printStar(n1);
        }
    }

    static void printStarTriangle(int n1) {
        for(int i=0;i<n1;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for(int i=1;i<=n1;i++) {
            printStar(i);
        }
    }
}