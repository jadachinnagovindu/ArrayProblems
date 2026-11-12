package com.basicArray_prablems;

import java.util.Scanner;

public class SearchAnArray {

	public static void main(String[] args) {
		int[] arr= {1,3,2,11,99,72};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Search Number");
		int search=sc.nextInt();
		
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				status=true;
				System.out.println("Search number is Found!!");
				break;
			}
		}
		if(!status)
		{
			System.out.println("Search number is Not Found");
		}

	}

}
