package com.abhi;

import java.util.Scanner;

public class LargestOfThreeNumber {

    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);

	System.out.println("Enter three value");
	int a=sc.nextInt()
            ,b=sc.nextInt()
            ,c=sc.nextInt();

	int LargestNumber=(a>b?(a>c?a:c):(b>c?b:c));

	System.out.println(LargestNumber);

    }
}
