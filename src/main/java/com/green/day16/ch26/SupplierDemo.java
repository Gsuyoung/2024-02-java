package com.green.day16.ch26;

import com.green.day13.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() * 50.0); //0~49
        System.out.println(supRandom.get());

        List<Integer> list = makeIntList(supRandom, 5);
        //램덤 정수값 5개를 가지고 있는 ArrayList를 리턴
        System.out.println(list);

        //랜덤 정수값(20~ 50) 8개를 가지고 있는 ArrayList를 리턴
        Supplier<Integer> supRandom1 = () -> (int)(Math.random() * 31.0)+20; //20~50
        List<Integer> list2 = makeIntList(supRandom1, 8);
        System.out.println(list2);

    }
    static List makeIntList(Supplier<Integer> sup, int len) {
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(sup.get());
        }
        return list;
    }
}
