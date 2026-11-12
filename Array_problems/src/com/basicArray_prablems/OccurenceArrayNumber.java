package com.basicArray_prablems;

public class OccurenceArrayNumber {

	public static void main(String[] args) {
		int[] arr= {10,20,10,10,30,40,40,20,50};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			boolean status=false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					status=true;
					break;
				}
			}
			if(!status)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						
					}
				}
				System.out.println(arr[i]+" Occure "+count+"times");
			}
		}

	}

}
