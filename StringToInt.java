package com.abhi;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();

        System.out.println("The integer value of String "+str+" is " +Integer.parseInt(str));
    }
}
