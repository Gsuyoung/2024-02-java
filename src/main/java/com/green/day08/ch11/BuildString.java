package com.green.day08.ch11;

//p.264 ~ 269
public class BuildString {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("123");
        sb3.append(45678).delete(0, 2).replace(0, 3, "kk"); //체이닝기법
        System.out.println("sb3: " + sb3);
        // 123
        // 12345678
        // 345678
        // kk678

        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678); //뒤쪽에 붙일때 사용

        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        //미니 미션
        //모든 문자열을 지우는 방법(치사하게 하지 말고)
        sb.delete(0, sb.length());
        System.out.println("sb: " + sb);

        sb.append(345678);
        System.out.println("sb: " + sb);

        sb.replace(0, 3, "AB");
        String str = sb.toString(); // StringBuilder에서 String타입으로 변경(passing)
        //String타입으로 못 바꾸는건 없다.(객체도 가능)
        System.out.println("sb: " + sb);
        System.out.println("str: " + str);

        StringBuilder sb2 = sb.reverse().replace(0, 2, "kk");
        //체이닝 기법, 각 메소드에서 return this를 하기 때문

        System.out.println("sb: " + sb);
        System.out.println("sb == sb2: " + (sb == sb2));

    }
}
