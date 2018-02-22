package com.java.basicprogram;

import java.util.Scanner;

public class ArrayRotation {
/**
 * 
 * array rotation 
 * n of rotation
 * 
 */
	
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
	      
		 for (int i = 0; i < k; i++) {
				int j;
				int temp =a[0];
				for (j = 0; j< n-1; j++) {
					a[j] =a[j+1];
				}
				a[j] = temp;
			}
	        return a;
			
	    }
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		a = arrayLeftRotation(a, n, k);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		s.close();
	}

}
