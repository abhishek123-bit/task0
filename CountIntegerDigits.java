package com.abhi;

import java.util.Scanner;

public class CountIntegerDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits in "+m+" is "+count);
    }
}
