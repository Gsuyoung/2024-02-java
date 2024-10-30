package com.green.day15.ch21;

//제네릭은 실행시점에 타입이 정해진다.
public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        Apple apple = appleBox.getBox();

        BoxGeneric<Orange> orangeBox = new BoxGeneric<>(new Orange());
        Orange orange = orangeBox.getBox();

        //new 부분에 <>를 생략하면 객체의 타입은 제네릭의 타입인 Object가 되는 것 같음.
        //단순히 타입에 적은(<Orange>)로 형변환을 하는 것으로 예상됨.
        //new 부분에 <>를 작성하는 것이 성능에 도움이 된다.
        BoxGeneric<Orange> orangeBox2 = new BoxGeneric(new String());
        orangeBox2.getBox();
        //BoxGeneric<Orange> orangeBox3 = new BoxGeneric<>(new String());

    }
}

class BoxGeneric<T> { //'< >'아직 타입을 정하지 않았다. 객체화할때 타입을 정하겠다.
    private T fruit;

    BoxGeneric(T fruit) {
        this.fruit = fruit;
    }

    T getBox() {
        return this.fruit;
    }
}
