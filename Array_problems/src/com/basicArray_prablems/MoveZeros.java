package com.basicArray_prablems;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 0, 9, 1, 0, 7, 0 };

		int index = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] != 0) {
//				arr[index] = arr[i];
//				index++;
//			}
//		}
//
//		for (int i = index; i < arr.length; i++) {
//			arr[i] = 0;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}