
package com.basicArray_prablems;

import java.util.Scanner;

public class MinAndMaxUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter numbers");
        int min = numbers[0];
        int max = numbers[0];

        for (int i =0;i<size;i++) {
        	numbers[i]= sc.nextInt();

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
    }
}
