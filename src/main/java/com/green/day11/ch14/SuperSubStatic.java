package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS c1 = new SubCLS();
        SuperCLS c2 = new SubCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); //3

    }
}

class SuperCLS {
    protected static int count;
    SuperCLS() {

    }
    SuperCLS(int a) {
        count++;
    }
}

class SubCLS extends SuperCLS {
    SubCLS() {
        super();
    }
    void showCount() {
        System.out.println("count: " + count);
    }
}
