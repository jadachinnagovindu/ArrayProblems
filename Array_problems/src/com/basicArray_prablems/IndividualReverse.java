package com.basicArray_prablems;

//1.Write a Java program to print Reverse of Element in the Given Array?
//i/p: int arr[]={11,12,13,14,15,16}; 
//o/p:	{11,21,31,41,51,61};
public class IndividualReverse {

	public static void main(String[] args) {
		
		int arr[]= {11,12,13,14,15,16};
		
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int rev=0;
			while(n>0)
			{
				int r=n%10;//12=2,1
				rev=rev*10+r;//2
				n=n/10;//1
			}
			arr[i]=rev;
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}

		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
