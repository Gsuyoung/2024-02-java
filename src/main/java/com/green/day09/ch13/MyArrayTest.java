package com.green.day09.ch13;

import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        int[] arr = {3,10,66,7};

        System.out.println(Arrays.toString(arr));
        System.out.println(MyArraysTest.toString(arr));
        System.out.println(MyArraysTest.toString(arr));
        System.out.println(MyArraysTest.toString(arr));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr == arr2);
        System.out.println(MyArraysTest.toString(arr2));

        int[] arr3 = MyArraysTest.copyOf(arr);
        System.out.println(arr == arr3);
        System.out.println(MyArraysTest.toString(arr3));

        int[] arr4 = MyArraysTest.copyOf(arr,2);
        System.out.println(MyArraysTest.toString(arr4));

        int[] arr5 = MyArraysTest.copyOf(arr,3);
        System.out.println(MyArraysTest.toString(arr5));
    }
}
