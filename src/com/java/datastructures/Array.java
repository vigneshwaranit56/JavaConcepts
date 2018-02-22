package com.java.datastructures;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		/**
		 * 
		 * array reverse 
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            
        }
        */
        
		Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        
        System.out.println(maxHourglass(arr));
        
//        in.close();
	}

	 public static int maxHourglass(int [][] arr) {
	        int max = Integer.MIN_VALUE;
	        for (int row = 0; row < 4; row++) {
	            for (int col = 0; col < 4; col++) {
	                int sum = findSum(arr, row, col);
	                max = Math.max(max, sum);
	            }
	        }
	        return max;
	    }
	    
	    private static int findSum(int [][] arr, int r, int c) {
	        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2] 
	                                + arr[r+1][c+1] + 
	                  arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
	        return sum;
	    }
}


	
