package com.abhi.recursion;

import java.util.Scanner;

public class Power {

    static Scanner sc = new Scanner(System.in);

    //this methood give time complexcity of O(log(N))
    public static int findPower(int base, int power) {

        if (power == 0)
            return 1;
        if (base == 0)
            return 0;
        if (power < 0 || base < 0)
            return Integer.MIN_VALUE;

        if (power % 2 == 0) {
            return findPower(base, power / 2) * findPower(base, power / 2);
        } else {
            return findPower(base, power / 2) * findPower(base, power / 2) * base;
        }

    }

    //this method take time complexity of O(N)
    public static int findPower2(int base, int power) {
        if (base == 0)
            return 0;
        if (power == 0)
            return 1;
        if (power < 0 || base < 0)
            return Integer.MIN_VALUE;

        return base * findPower2(base, power - 1);


    }

    public static void main(String[] args) {
        System.out.println("Enter base Number..::");
        int base = sc.nextInt();
        System.out.println("Enter power Number..::");
        int power = sc.nextInt();
        System.out.println(findPower2(base, power));
        System.out.println(findPower(base, power));

    }
}
