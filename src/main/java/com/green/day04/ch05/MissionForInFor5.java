package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0 + 3);
        System.out.print("star 값은? " + star);

        for (int i=0; i<=star; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int z=star-1;z>i; z--) {
                System.out.print("_");
            }
        }
    }
}
