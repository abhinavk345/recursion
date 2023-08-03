package com.abhi.recursion;

public class CheckArraySorted {

    public static boolean checkArraySorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return checkArraySorted(arr, index + 1);

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 16, 117, 338};

        System.out.println(checkArraySorted(arr, 0));
    }
}
