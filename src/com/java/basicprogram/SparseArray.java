package com.java.basicprogram;

import java.util.HashMap;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		String[] strArr = new String[n];
		
		for (int i = 0; i < n; i++) {
			strArr[i] = sc.next();
		
		}
		
		int m =sc.nextInt();
		String[] qArr = new String[n];
		
		for (int i = 0; i < m; i++) 
			qArr[i] = sc.next();
	
		
		for (int i = 0; i < qArr.length-1; i++) {
			int count = count(strArr,qArr[i]);
		System.out.println(count);
		}
		
		
		
		sc.close();

	}

	private static int count(String[] strArr, String qArr) {
	
			int count =0;
			for (int j = 0; j < strArr.length; j++) {
				if(qArr.equalsIgnoreCase(strArr[j]))
					count++;
			}
			
		return count;
		
	}

}
