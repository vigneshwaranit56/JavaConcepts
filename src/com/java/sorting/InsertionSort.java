package com.java.sorting;

import java.util.Random;

public class InsertionSort { 
	
	public static int[] sort(int arr[]){
		
		
		for (int i = 1; i < arr.length; i++) {
			
			int j =i;
			int index = arr[i];
			while(j>0 && arr[j-1]>index){
				arr[j] = arr[j-1];
				j--;
				
			}
	        printSequence(arr);

			
			arr[j] = index;
			
		}
		
		return arr;
		
	}
	
	 static void printSequence(int[] sorted_sequence) 
	    {
	        for (int i = 0; i < sorted_sequence.length; i++)
	            System.out.print(sorted_sequence[i] + " ");
	        System.out.println();
	    }
	
	public static void main(String args[]){
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
