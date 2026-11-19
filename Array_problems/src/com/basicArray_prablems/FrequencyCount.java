package com.basicArray_prablems;

//1)Write java program to find frequent count of elements in given array 
//arr={1,2,1,3,1,2,3,4,5,6,1,4,2}
//output:
//1->4
//2->3
//3->2
//4->2
//5->1
//6->1
public class FrequencyCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 1, 2, 3, 4, 5, 6, 1, 4, 2 };
		int n = arr.length;

		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(arr[i] + "->" + count);
		}
	}
}
