package com.abhi.recursion;

public class PrintSumOfNNumber {

    public static int findSum(int n){
        if(n!=0){
          return n+findSum(n-1);
        }
        return  n;

    }

    public static int findSum2(int n){
        if(n==0){
            return 0;
        }
        return  n+findSum2(n-1);

    }



    public static void main(String[] args) {
        System.out.println(findSum(10));
        System.out.println(findSum2(10));
    }
}
