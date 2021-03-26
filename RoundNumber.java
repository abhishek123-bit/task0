package com.abhi;

import java.util.Scanner;

public class RoundNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        float a=sc.nextFloat();

        System.out.println("Enter the round place value");
        int roundPlace= sc.nextInt();

        System.out.format("%."+roundPlace+"f",a);
    }
}
