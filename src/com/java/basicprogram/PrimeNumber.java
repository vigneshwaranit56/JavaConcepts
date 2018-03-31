package com.java.basicprogram;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n == 1)
			return true;

		int f = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}

		if (f == 2)
			return true;

		return false;

	}

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {

			if (isPrime(i))
				System.out.println(i);
		}

		s.close();
		        
		     
		    

	}
}
