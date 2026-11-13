package com.basicArray_prablems;


//1.Write a Java Program to find the K’th largest element in given integer array?
//int[] a={4,5,7,1,3}
//int k=3
//output:-4
public class NthLargest {

	public static void main(String[] args) {
		int[] arr= {4,5,7,1,3};
		int k=2;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]==arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Nth Elements"+(arr.length-k));
		
		
		
		
		
//		int[] arr= {12,45,23,67,89,34};
		
		
	}

}
