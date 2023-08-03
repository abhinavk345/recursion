package com.abhi.recursion;



public class PrintNDigitNo {

    public static void printNumberInAscending(int i,int n) {
        if (n==1){
            System.out.print(i+"  ");
        return;
    }
        System.out.print(i++ +"  ");
        printNumberInAscending(i++,n-1);
    }




    public static void printNumberReversed(int n){
        if (n==0)
            return;
        System.out.print(n+ "  ");
        printNumberReversed(n-1);
    }


    public static void main(String[] args) {
        printNumberReversed(10);
        System.out.println("======================");
        printNumberInAscending(1,10);
    }
}
