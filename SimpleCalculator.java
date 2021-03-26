package com.abhi;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int num1 = sc.nextInt(),
                num2=sc.nextInt();

        System.out.println("Enter the sign +,-,*,/,%");

        char ch=sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':

                System.out.println(num1+"/"+num2+"="+((float)num1/num2));
                break;
            case '%':
                System.out.println(num1+"%"+num2+"="+(num1%num2));
                break;
            default:
                System.out.println("Please enter a valid sign");
        }
    }
}
