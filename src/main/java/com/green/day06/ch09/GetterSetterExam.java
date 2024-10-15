package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student(); //s1객체
        s1.setName("홍길동"); //s1의 주소값과 this.name의 this의 주소값이 같다.
        System.out.println(s1.getName());
        s1.setAge(10);
        System.out.println(s1.getAge());
        s1.setHeight(163.8f);
        System.out.println(s1.getHeight());

        Student s2 = new Student(); //s2객체
        s1.setName("신사임당");

    }
}

class Student {
    private String name; //맴버필드에 private을 붙힌 형태
    private int age;
    private float height;
    //this는 나 자신의 주소값이 지정된 상수 (나 자신의 주소값이 저장된 공간)

    //name-setter : 값을 주입할 때(무조건 void 메소드)
    public void setName(String name) {
        this.name = name; //this가 붙은 name이 매개변수(전역변수)
                         //this가 안 붙은 name은 가장 가까이 있는 name
    }
    //name-getter : 값을 뺄 때(무조건 return 메소드), 파라미터가 필요없다.
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
