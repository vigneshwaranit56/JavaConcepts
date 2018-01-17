package com.java.sampleprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class MergeTwoSorted {
	/**
	 * merge two sorted without duplicate element
	 * @param arr1
	 * @param arr2
	 * @param n1
	 * @param n2
	 * @param arr3
	 */
	public static void mergeArrays(int[] arr1, int[] arr2, int n1,
            int n2, int[] arr3)
{
int i = 0, j = 0, k = 0;

// Traverse both array
while (i<n1 && j <n2)
{
// Check if current element of first
// array is smaller than current element
// of second array. If yes, store first
// array element and increment first array
// index. Otherwise do same with second array
if (arr1[i] < arr2[j])
arr3[k++] = arr1[i++];
else
arr3[k++] = arr2[j++];
}

// Store remaining elements of first array
while (i < n1)
arr3[k++] = arr1[i++];

// Store remaining elements of second array
while (j < n2)
arr3[k++] = arr2[j++];
}
	
	static int[] removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
       
      
        int[] temp = new int[n];
         
        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];   
         
        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return temp;
    }

	public static void main(String[] args) {
        int[] arr1 = { 2,4,5,6,7,9,10,13};
        int n1 = arr1.length;
     
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
     
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
       System.out.println();
       System.out.println();
        int arr[] = removeDuplicates(arr3, arr3.length);
        
        
        
        for (int i=0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        
	}

}
