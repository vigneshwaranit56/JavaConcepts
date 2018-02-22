package com.java.basicprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CustomSortArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		moves(a);
		s.close();

	}

	static int moves(int[] a) {
		int count =0;
		
		Map<String,Integer> map = new HashMap<>();
		for (int i = 1; i < a.length; i++) {
			
			if(a[i] % 2 == 0){
				map.put("even", i);				
				count++;
			}
			else
				map.put("odd", i);
			
		}
		
	System.out.println(map);
		
		
		
	return count/2;

    }
}
