package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit();
        Orange orange = (Orange)orangeBox.getFruit();

        FruitBox orangeBox2 = new FruitBox("오렌지");
        Orange orange2 = (Orange)orangeBox2.getFruit(); //Object와 Orange는 아무런 관련이 없다.
                                                        //상속관계가 아니라서 형변환이 불가능

        System.out.println("-- 끝 --");
    }
}

class FruitBox {
    private Object fruit;

    public FruitBox(Object fruit) {
        this.fruit = fruit;
    }

    public Object getFruit() {
        return fruit;
    }
}
