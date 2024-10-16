package com.green.day06.ch07;

/*
    일반 변수(primitive type) --> 처리속도가 빠르다(실속을 챙기기위해서)
    참조 변수(reference type)
    차이점을 설명하는 예제
 */
public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        /*
        main메소드에 있는 num변수(main_num)와 changeNume메소드에 있는 num매개변수(m_num)는
        다른 공간이다. main_num이 가지고 있는 값을 복사하여 m_num에 저장했다.
        m_num값을 변경한다고 하여 main_num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
         */
        int num = 10; //primitive type(소문자로 시작)
        changNum(num);
        System.out.println("num = " + num); //10

        /*
        main메소드에 있는 nb변수(main_nm)와 changeNum메소드에 있는 nb매개변수(m_nb)는 다른 공간이다.
        다만 같은 값(주소값)을 가지고 있다. 그로인해 같은 객체에 접근할 수 있다.
        m_nb를 통해 객체의 num값을 변경했다면 main_nb를 통해 접근했을 때 변경된 값을 얻게 된다.
         */
        NumberBox nb = new NumberBox(); //reference type(대문자로 시작)
        nb.num = 10;
        changNum(nb);
        System.out.println("nb.num = " + nb.num); //100
    }

    public static void changNum(int num) {
        num = 100;
    }

    public static void changNum(NumberBox nb) {
        nb = new NumberBox(); //10 ---> 새로운 객체가 만들어진 상태
        nb.num = 100;
    }
}

class NumberBox {
    int num;
}