package com.basicArray_prablems;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double avg=0;
		System.out.println("Enter Your Size");
		int size=sc.nextInt();
		int[] marks=new int[size];
		System.out.println("Enter Your marks");
		
//		for(int i=0;i<size;i++)
//		{
//			marks[i]=sc.nextInt();
//			
//			sum=sum+marks[i];
//		}
		for(int m:marks)
		{
			m=sc.nextInt();
			sum+=m;
		}
		avg=sum/size;
		System.out.println(sum);
		System.out.println(avg);
		
		

	}

}
