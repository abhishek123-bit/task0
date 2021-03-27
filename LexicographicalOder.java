package com.abhi;

import java.util.Scanner;

public class LexicographicalOder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n" );
        int n=sc.nextInt();

        System.out.println("Enter "+n+" strings");
        String[] str=new String[n];
        sc.nextLine();
        for (int i = 0; i <n ; i++) {
            str[i]=sc.nextLine();
        }
        System.out.println("Before Lexicographical Oder");
        for(String s:str){
            System.out.print(s+",");
        }
        System.out.println("\n\nAfter Lexicographical Oder");
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length ; j++) {
                if(str[i].compareTo(str[j])>0){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
            System.out.print(str[i]+",");
        }

    }
}
