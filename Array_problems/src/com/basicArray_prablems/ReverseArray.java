package com.basicArray_prablems;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] n= {10,20,30,40,50};
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.println(n[i]);
		}
		

	}

}
