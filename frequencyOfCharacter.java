package com.abhi;

import java.util.Scanner;

public class frequencyOfCharacter {
    int count;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        str=str.trim();
        boolean []checkChar=new boolean[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                continue;
            }
            int count= 1;

            for (int j = i+1; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)&&!checkChar[j]){
                    checkChar[j]=true;
                    count++;
                }
            }
            if (!checkChar[i])
            System.out.println("The frequency of character "+str.charAt(i)+" is "+count);
        }
    }
}
