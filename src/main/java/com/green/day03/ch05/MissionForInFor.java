package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {

        for(int i =2;i<10;i++) {
            System.out.println("--------------");

            for(int z=1;z<10;z++) {
                System.out.printf("%d x %d = %d",i,z,(i * z));
                System.out.println();
            }
        }
    }
}