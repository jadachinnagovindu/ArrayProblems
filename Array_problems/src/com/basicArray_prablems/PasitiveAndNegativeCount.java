package com.basicArray_prablems;

import java.util.Scanner;

public class PasitiveAndNegativeCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size :");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		int Pcount=0;
		int Ncount=0;
		System.out.println("Enter the Numbers :");
		for(int n:numbers)
		{
			n=sc.nextInt();
			if(n>0)
			{
				Pcount++;
			}
			else
			{
				Ncount++;
			}
		}
		System.out.println("Positive Numberscount :"+Pcount);
		System.out.println("Nagative Numberscount :"+Ncount);

	}
}