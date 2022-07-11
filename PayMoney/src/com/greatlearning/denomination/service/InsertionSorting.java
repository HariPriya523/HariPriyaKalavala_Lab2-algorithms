package com.greatlearning.denomination.service;

public class InsertionSorting {

public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]= temp;
		}
		for (int i : arr)
			System.out.println(i);
		return arr;

	}
}
