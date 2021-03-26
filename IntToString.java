package com.abhi;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        String str=""+a;

        System.out.println("The String value of Integer "+a+" is "+str);
    }
}
