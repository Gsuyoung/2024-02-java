package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
       /* arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6; */

    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public void add(int num) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = num;

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp; //주소값을 바꾼다.
    }

    public int size() {
        return arr.length;
    }

    public void clear() {
        arr = new int[0];
    }

    public int remove() {
        int[] tmp = new int[arr.length - 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i];
        }
        int removeVal = arr[tmp.length];
        arr = tmp;
        return removeVal;
    }
}

