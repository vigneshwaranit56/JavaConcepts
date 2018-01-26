package com.java.basicprogram;

import java.util.Scanner;

public class SubArrayWithMean {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		for (int i = 0; i <q; i++) {
			int l = scanner.nextInt();
			int m = scanner.nextInt();
			
			sum(arr,l,m);
			
		}
		
		scanner.close();

	}

	private static void sum(int[] arr, int l, int m) {
		int sum =0;
		int k =0;
		
		for (int j = l+1; j < m; j++) {
			
			sum=sum+arr[j];
			System.out.println(sum);
			k++;
			
		}
		System.out.println(k+"  "+sum);
		
		System.out.println(sum/k-1);
		
	}

}
