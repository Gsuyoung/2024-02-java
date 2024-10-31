package com.green.day16;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        //배열안에서 가장 큰 숫자 리턴
        Function<int[], Integer> fn = n -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        };

        int maxValue = fn.apply(arr);
        System.out.println("maxValue: " + maxValue);
    }
}