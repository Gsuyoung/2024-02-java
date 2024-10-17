package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        aw.increaseCnt();
        aw.num++;
        AccessWay.num++;
        System.out.printf("num: %d\n", AccessWay.num); //클래스명.static 변수 or 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num);//가능은 하나 static때문에 객체화를 할 필요없어서 쓸일이 없다.
    }
}

class AccessWay {
    static int num = 0;
    AccessWay() { increaseCnt(); }
    void increaseCnt() { //static이 붙지않은 메소드도 static이 붙은 메소드를 사용할 수 있다.
                        //이미 메모리에 값이 올라가있기때문에
        num++;
    }
}
