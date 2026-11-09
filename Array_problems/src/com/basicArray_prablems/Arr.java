package com.basicArray_prablems;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array Size : ");
		int n=sc.nextInt();
		String[] names=new String[n];
		names[0]="Chinna";
		names[1]="Govindu";
		names[2]="Jada";
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}

	}

}
