package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];

        //1~20순차적으로 값을 넗어주세요.
        for (int i=0; i<arr.length; i++) {
            arr[i]=i+1;

        }
        System.out.println(Arrays.toString(arr));
    }
}
