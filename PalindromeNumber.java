package com.abhi;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=n;
        int r=0;

        while(n>0){
            r=r*10+(n%10);
            n=n/10;
        }
        if(m==r){
            System.out.println(m+" is a Palindrome Number");
        }
        else {
            System.out.println(m+" is not a Palindrome Number");

        }

    }
}
