package com.basicArray_prablems;

//1.Write a java program  to rounding of elements in given array
//Eg: arr[]={99,95,71,84,81,75,60}
//Output: {100,90,70,80,80,70,60}

public class RowndingElements {

    public static void main(String[] args) {

        int[] arr = {99, 95, 71, 84, 81, 75, 60};

        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];
            int r=n%10;
            if(r>5)
            {
            	int a=10-r;
            	arr[i]=arr[i]+a;
            }
            else
            {
            	arr[i]=arr[i]-r;
            }
            System.out.println(arr[i]+" ");
            
        }
       
        
    }
}



