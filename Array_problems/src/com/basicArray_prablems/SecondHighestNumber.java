package com.basicArray_prablems;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr= {7,5,8,26,13};
		int largest=arr[0];
		int second=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second=largest;
				largest=arr[i];
			}
			else if(arr[i]>second && arr[i]!=largest)
			{
				second=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(second);

	}

}
