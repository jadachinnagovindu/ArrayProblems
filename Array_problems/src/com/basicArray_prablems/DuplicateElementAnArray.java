package com.basicArray_prablems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementAnArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,20,40,10};
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Duplicated Values :"+arr[i]);
//					break;
//				}
//			}
//		}

		Set<Integer> s=new HashSet<>();
		for(int a:arr)
		{
			s.add(a);
		}
		System.out.println(s+" ");
	}

}
