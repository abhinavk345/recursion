package com.abhi.recursion;

import java.util.Scanner;

public class ReverseString {
  public static   void stringReverse(String str,int length  ){

      if(length==0){
          System.out.print(str.charAt(length));
          return;
      }
      System.out.print(str.charAt(length));
      stringReverse(str,length-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String value:: ");
        String name=sc.nextLine();
       stringReverse(name,name.length()-1);


    }
}
