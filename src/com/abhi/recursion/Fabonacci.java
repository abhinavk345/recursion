package com.abhi.recursion;

import java.util.Scanner;

public class Fabonacci {
    static Scanner sc = new Scanner(System.in);

    public static void printFabonacci(int first, int second, int term) {
        if (term == 0)
            return;
        int next = first + second;
        System.out.print(next + " ");
        printFabonacci(second, next, term - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter first Number..::");
        int first = sc.nextInt();
        System.out.println("Enter second Number..::");
        int second = sc.nextInt();
        System.out.println("Enter No of term you want..::");
        int term = sc.nextInt();
        System.out.print(first + " " + second + " ");
        printFabonacci(first, second, term - 2);
    }
}
