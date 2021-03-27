package com.abhi;

import java.util.Random;
import java.util.Scanner;

public class RandomStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random =new Random();
        String Characters = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Enter length of random string");

        int l=sc.nextInt();
        String str="";
        for (int i = 0; i <l ; i++) {
            int position=random.nextInt(Characters.length());
            str+=Characters.charAt(position);
        }
        System.out.println(str);
    }
}
