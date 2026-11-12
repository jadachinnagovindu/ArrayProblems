package com.basicArray_prablems;

import java.util.Scanner;

public class CountEvenAndOddElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		int Ecount=0;
		int Ocount=0;
		System.out.println("Enter the numbers :");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
			if(numbers[i]%2==0)
			{
				Ecount++;
			}
			else 
			{
				Ocount++;
			}
			
		}
		System.out.println("even numbers :" +Ecount);
		System.out.println("odd numbers :" +Ocount);
//		for(int n:numbers)
//		{
//			System.out.println(n);
//		}

	}

}
