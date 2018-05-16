package com.java.sorting;

import java.util.Random;

public class SelectionSort {

	public static int[] sort(int arr[]) {
		

		   for (int i = 0; i < arr.length-1; i++) // no need to check for last element so length -1
		   {
		      int min = i;
		      for (int j = i+1; j < arr.length; j++)
		            if (arr[j] < arr[min])
		            	min = j;
		      int temp = arr[i];
		      arr[i] = arr[min];
		      arr[min] = temp;
		} 

		
	
		return arr;
	}

	static void printSequence(int[] sorted_sequence) {
		for (int i = 0; i < sorted_sequence.length; i++)
			System.out.print(sorted_sequence[i] + " ");
	}

	public static void main(String[] args) {
		Random random = new Random();
		int N = 20;
		int[] sequence = new int[N];

		for (int i = 0; i < N; i++)
			sequence[i] = Math.abs(random.nextInt(100));

		System.out.println("\nOriginal Sequence: ");
		printSequence(sequence);

		System.out.println("\nSorted Sequence: ");
		printSequence(sort(sequence));
	}

}
