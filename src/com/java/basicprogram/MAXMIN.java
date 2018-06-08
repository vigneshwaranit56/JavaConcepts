package com.java.basicprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAXMIN {

	private static final Scanner scanner = new Scanner(System.in);

	private static long sum = 0;

	public static void main(String[] args) {

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		List<Long> lis = new ArrayList<Long>();
		
		for (int i = 0; i < arrItems.length; i++) 
			lis.add((long) Integer.parseInt(arrItems[i]));
		
		//
		// sum = sum(arr);
		//
		// miniMaxSum(arr);
		//
		// scanner.close();

		long sum = 0;

		long min = 10000000;
		long max = 0;

for(Long n:lis){

			sum = sum + n;

			if (n < min)
				min = n;
			else if (n > max)
				max = n;

		}
		scanner.close();

		System.out.println((sum - max) + " " + (sum - min));

	}

	private static long sum(long[] arr) {

		long sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = (int) (sum + arr[i]);

		return sum;

	}

	private static void miniMaxSum(long[] arr) {

		long small = sum - arr[0];
		long large = sum - arr[0];

		for (int i = 1; i < arr.length; i++) {
			long remain = sum - arr[i];

			if (remain < small)
				small = remain;
			else if (remain > large)
				large = remain;

		}

		System.out.println(small + " " + large);

	}
}
