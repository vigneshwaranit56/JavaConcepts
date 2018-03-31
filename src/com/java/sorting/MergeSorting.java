package com.java.sorting;

public class MergeSorting {

	public static void sortAscending(int[] a, int low, int high)
    {
        int N = high - low;
        if (N <= 1)
            return;
        int mid = low + N/2;
        
        // recursively sort
        sortAscending(a, low, mid);
        sortAscending(a, mid, high);
        
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++)
        {
        	
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j]<a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < N; k++)
            a[low + k] = temp[k];
    }
	
	 public static void sortDescending(int[] a, int low, int high)
	    {
	        int N = high - low;
	        if (N <= 1)
	            return;
	        int mid = low + N/2;
	        
	        // recursively sort
	        sortDescending(a, low, mid);
	        sortDescending(a, mid, high);
	        
	        // merge two sorted subarrays
	        int[] temp = new int[N];
	        int i = low, j = mid;
	        for (int k = 0; k < N; k++)
	        {
	            if (i == mid)
	                temp[k] = a[j++];
	            else if (j == high)
	                temp[k] = a[i++];
	            else if (a[j]>a[i])
	                temp[k] = a[j++];
	            else
	                temp[k] = a[i++];
	        }
	        for (int k = 0; k < N; k++)
	            a[low + k] = temp[k];
	    }

	 public static void main(String[] args)
	    {
	        int[] arr = {23, 35, 789, 12, 5, 297, 1, 63, -10};
	        int[] arr2 = {23, 35, 789, 12, 5, 297, 1, 63, -10};

	        System.out.println("Unsorted Array: ");
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        sortAscending(arr, 0, arr.length);

	        System.out.println("\nSorted Array (Ascending Order): ");
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }


	        sortDescending(arr2, 3, arr2.length);

	        System.out.println("\nSorted Array (Descending Order): ");
	        for (int element : arr2) {
	            System.out.print(element + " ");
	        }

	    }
}
