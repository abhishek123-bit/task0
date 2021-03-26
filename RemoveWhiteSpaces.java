package com.abhi;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        str = str.trim();

        String newStr="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
               continue;
            }
            newStr+=str.charAt(i);
        }

        System.out.println(newStr);
    }
}
