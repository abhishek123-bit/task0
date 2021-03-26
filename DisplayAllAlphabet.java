package com.abhi;

public class DisplayAllAlphabet {
    public static void main(String[] args) {
        char ch='A';
        for (int i = 'A'; i <='Z' ; i++) {
            System.out.print(ch+",");
            ch+=1;
        }
    }
}
