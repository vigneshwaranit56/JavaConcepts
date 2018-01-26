package com.java.basicprogram;

import java.util.Scanner;

public class PermutationWithString {
	private static int permutation(int noObjects, int noOfSample) {
		int ret = 0;

		ret = fact(noObjects) / fact(noObjects - noOfSample);

		return ret;
	}

	private static int fact(int noObjects) {
		int fact = 1;

		for (int i = 1; i <= noObjects; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static boolean compare(String str, String ref) {

		boolean isPresent = false;

		int permutation = permutation(str.length(), 1);
		int j = 0;
		while (j < permutation) {
			str = str.substring(1, str.length()) + str.substring(0, 1);
			j++;
System.out.println(str);
			if (ref.equals(str))
				isPresent = true;

		}
		
		String rev ="";
		
		for (int i = str.length()-1; i>=0 ; i--) {
			rev = rev+str.charAt(i)+"";
		}
		
		System.out.println(rev);
		if(rev.equals(ref))
			isPresent = true;

		return isPresent;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String str = s.next();
			String ref = s.next();
System.out.println();
			System.out.println(compare(str, ref) ? "YES" : "NO");

			
		}
		s.close();
	}

}
