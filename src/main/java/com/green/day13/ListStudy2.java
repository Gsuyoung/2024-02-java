package com.green.day13;

import java.util.ArrayList;
import java.util.List;
//<...> (Generic) 제네릭 : 실행될때 결정되는 타입을 설정할 수 있다.
//제네릭을 사용하여 결정하지 않으면 타입은 Object가 된다.
public class ListStudy2 {
    public static void main(String[] args) {
        //아래 3가지의 결과는 같다. 맘에드는 것 사용
        List<Integer> list = new ArrayList();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<Integer>();
        //list.add(""); --> String을 담을 수 없다.(정수형 값만 들어갈 수 있는 ArrayList객체가 만들어짐
        list.add(10); //0번방
        list.add(20); //1번방
        list.add(30); //2번방
        System.out.println(list);
        System.out.println(list.size());
        int n1 = list.get(0); //형변환 하지 않아도 된다.

        list.add(1, 60); //왼쪽값은 index, 오른쪽값은 값. 그방에 있는 값은 한칸씩 미뤄짐
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.add(0,30);
        System.out.println(list);
        System.out.println("list.lastIndexOf(30) : " + list.lastIndexOf(30));
        System.out.println("list.indexOf(30) : " + list.indexOf(30));

        //lastIndexOf, indexOf 메소드의 리턴값이 -1이면 해당값이 콜렉션에 없음.
        System.out.println("list.lastIndexOf(100) : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(100) : " + list.indexOf(100));

        list.add(null);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
