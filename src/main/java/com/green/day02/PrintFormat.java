package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용
         */

        String name = "홍길동";
        int age = 22;
        float height = 172.5f;
        char bloodType = '0';
        boolean isMan = true;

        //홍길동의 나이는 22살 키는 172.5cm 혈액형은 O형입니다. 그는 남자입니까? true

        System.out.println(name + "의 나이는 " + age + "살 키는"
                + height + "cm 혈액형은 " + bloodType
                + "형입니다. 그는 남자입니까? " + isMan);

        System.out.printf("%s의 나이는 %d살 키는 %.1fcm 혈액형은 %c형입니다. 그는 남자입니까? %b\n",
                name, age, height, bloodType,isMan);

        // %f 사이의 값을 주어서 기능을 활용할 수  있다. 12는 총 12칸을 차지한다.
        // 012는 12칸을 사용하는데 빈칸이 있으면 빈칸을 0으로 채운다.
        // %.1는 실수를 나타내는 길이
        System.out.printf("키는 %.1f\n", 172.2135453);
    }
}
