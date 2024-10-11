package com.green.day04.ch05;

public class MissionForInFor5_1 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0 + 3);
        System.out.println("star 값은? " + star);

        for(int i=0;i<star;i++) {
            for(int j=star-1;j>i;j--){
                System.out.print("_");
            }
            for(int z=0;z<=i;z++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
