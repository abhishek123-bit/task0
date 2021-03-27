package com.abhi;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();

        for (int i = 0; i <r ; i++) {
            for (int j = r; j >i+1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
