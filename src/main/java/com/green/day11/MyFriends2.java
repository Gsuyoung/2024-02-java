package com.green.day11;

public class MyFriends2 {
    public static void main(String[] args) {
        UnivFriend2[] arr = new UnivFriend2[3];
        CompFriend2[] arr1 = new CompFriend2[3];

        //다형성 : 다양한 형태가 될 수 있는 성질 --> 변수타입, 객체가 다르지만 저장할 수 있다.
        UnivFriend2 obj1 = new UnivFriend2("Lee", "Computer", "010-111-1111");
        Friend f1 = obj1; //상속관계에서만 다향성이 가능
        Friend f2 = new UnivFriend2("SEO", "Electronics", "010-222-2222");
        //Friend f2 의미 : Friend객체 주소값을 담을 수 있는 f2 레퍼런스 변수 + Friend를 상속받은 객체의 주소값도 담을 수 있다.

        Friend[] arr2 = new Friend[10]; //arr3의 각 방의 타입 : Friend
        //UnivFriend2,CompFriend2,Friend 객체 주소값 모두 담을 수 있는 배열을 만들 수 있다.
        arr2[0] = obj1;
        arr2[1] = f2;
        arr2[2] = new CompFriend2("YOON", "R&D 1", "02-123-9999");
        arr2[3] = new CompFriend2("PARK", "R&D 2", "02-333-5555");

        arr2[0].showInfo();
        //arr2[4].showInfo(); null point exception 발생!

        //반복문으로 arr2에 객체주소값이 있는 친구들만 showinfo() 메소드 호출

        System.out.println("================");

        for (int i = 0; i < arr2.length; i++) {
            Friend item = arr2[i];
            if (item == null) {
                continue;
            }
            item.showInfo();
            System.out.println();
        }
        //main 메소드는 수정 금지!
        //이름, 전화번호 + 대학친구는 전공도 출력, 직장동료는 부서 출력

    }
}

//생성자를 통해 멤버필드 초기화 가능하게 작성
class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

//이름, 전화, 전공값을 초기화 할 수 있는 생성자 작성
class UnivFriend2 extends Friend {
    private String major;

    UnivFriend2(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

//CompFriend와 같은 능력이 있는 2를 만들어주세요.
class CompFriend2 extends Friend {
    private String department;

    CompFriend2(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}