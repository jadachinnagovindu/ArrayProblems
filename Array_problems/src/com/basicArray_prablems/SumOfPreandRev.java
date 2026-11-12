package com.basicArray_prablems;

//2.Write a Java Program to create  a new array where each element is 
//the sum of the previous and next element of the given array? 
//i/p: int arr[]={10,20,30,40,50,60};
//O/p: {30,40,60,80,100,110};

public class SumOfPreandRev {

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int[] newarr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				newarr[i]=arr[i]+arr[i+1];
				
			}
			else if(i==arr.length-1)
			{
				newarr[i]=arr[i-1]+arr[i];
			}
			else
			{
				newarr[i]=arr[i-1]+arr[i+1];
			}
		}
		for(int na:newarr)
		{
			System.out.println(na);
		}
		
   
	}

}
