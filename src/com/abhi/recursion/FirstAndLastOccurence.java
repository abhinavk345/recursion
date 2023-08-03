package com.abhi.recursion;

public class FirstAndLastOccurence {

     static int FIRST = -1;
     static int LAST = -1;

    public static void findFirstAndLastOccurence(String str, int index, char ch) {
        if (index == str.length()) {
            System.out.println("First index is ::" + FIRST);
            System.out.println("Last index is ::" + LAST);
            return;
        }

        char currentChar = str.charAt(index);
        if (currentChar == ch) {
            if (FIRST == -1)
                FIRST = index;
            else LAST = index;
        }
        findFirstAndLastOccurence(str, index + 1, ch);
    }

    public static void main(String[] args) {
        String str = "sdfgsfgh";
        findFirstAndLastOccurence(str, 0, 's');
    }
}
