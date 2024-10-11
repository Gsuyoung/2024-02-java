package com.green.day04.ch05;

public class MissionForInFor5_2 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0 + 3);
        System.out.println("star 값은? " + star);

        for(int i=1;i<=star;i++) {
            for(int j=star;j>i;j--){
                System.out.print("_");
            }
            for(int z=0;z<i;z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for(int i=star;i>0;i--) {
            for (int z = 1; z <= star; z--) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
