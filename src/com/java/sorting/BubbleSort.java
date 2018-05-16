package com.java.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
int a[] = new int[]{7,1,9,4,3,6};
		
		    for(int  k = 0; k < a.length - 1; k++){
		         for(int i = 0; i < a.length - 1 - k; i++) {

		             if (a[i] > a[i + 1]) {
		                 int temp = a[i+1];
		                 a[i+1] = a[i];
		                 a[i] = temp;

		             }

		        }
		    }
		    
		   System.out.println( Arrays.toString(a));

	
	}
}
