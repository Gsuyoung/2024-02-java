package com.green.day06.ch09;

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.setRad(1.5);
        System.out.println("원의 넓이(1) : " + c.getArea());

        //c.rad = -3.3; // rad 멤버필드에 접근이 되지 않는다.(읽기/쓰기 불가능)
        c.setRad(-3.3);
        System.out.println("원의 넓이(2) : " + c.getArea());

        System.out.println(c.PI);
    }
}

class Circle2 {
    private double rad = 0; //캡슐화,은닉화 private --> 접근지시어
                            //private이 붙으면 중괄호 밖의 스코프에서는 접근할수없다.
    final double PI = 3.14; //private이 안붙었으므로 외부에서 사용이 가능하다.

    public void setRad(double r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}