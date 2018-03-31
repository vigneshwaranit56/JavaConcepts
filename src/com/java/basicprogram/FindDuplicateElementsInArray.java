package com.java.basicprogram;

import java.util.stream.IntStream;

public class FindDuplicateElementsInArray {

	
	public static int findDuplicate(int[] A)
    {
		
        int actual_sum = IntStream.of(A).sum();
         System.out.println(actual_sum);
        int expected_sum = A.length * (A.length - 1) / 2;
         System.out.println(expected_sum);
 
 
        return actual_sum - expected_sum;
    }
	
	
	/*
    public static int findDuplicate(int[] A)
    {
        // create an visited array of size n+1
        // we can also use map instead of visited array
        boolean visited[] = new boolean[A.length + 1];

        // for each element of the array mark it as visited and
        // return the element if it is seen before
        for (int i = 0; i < A.length; i++)
        {
            // if element is seen before
            if (visited[A[i]]) {
                return A[i];
            }

            // mark element as visited
            visited[A[i]] = true;
        }

        // no duplicate found
        return -1;
    }*/

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,43,43};
	System.out.println(findDuplicate(a));
		

	}

}
