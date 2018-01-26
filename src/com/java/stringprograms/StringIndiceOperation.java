package com.java.stringprograms;

import java.util.Scanner;

public class StringIndiceOperation {

	/*
	 * SAMPLE INPUT 
helloworld
2
1 a
8 x
2
2 3
2 4

SAMPLE OUTPUT 
aellowoxld
alelowoxld
8
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//
		String txt = s.next();

		int q = s.nextInt();

		for (int i = 0; i < q; i++) {
			int n = s.nextInt();
			char a = s.next().charAt(0);

			txt = operationQ(txt, n, a);

		}

		System.out.println(txt);
		final String originalTxt = txt;
		int p = s.nextInt();

		for (int i = 0; i < p; i++) {
			int n = s.nextInt();
			int m = s.nextInt();

			txt = operationP(txt, n, m);

		}
		System.out.println(txt);

		int count = countVariation(originalTxt, txt);
		
		System.out.println(count);

		s.close();

	}

	private static int countVariation(String originalTxt, String txt) {

		int count = 0;

		for (int i = 0; i < txt.length(); i++) {

			if (originalTxt.charAt(i) == txt.charAt(i))
				++count;

		}

		return count;
	}

	private static String operationQ(String txt, int n, char a) {

		char ch[] = txt.toCharArray();
		ch[n - 1] = a;

		return String.valueOf(ch);
	}

	private static String operationP(String txt, int n, int m) {
		char ch[] = txt.toCharArray();
		String sub = txt.substring(n - 1, m);
		String rev = "";

		for (int i = sub.length() - 1; i >= 0; i--)
			rev += sub.charAt(i);

		int j = 0;
		for (int i = n - 1; i < m; i++) {
			ch[i] = rev.charAt(j++);

		}

		return String.valueOf(ch);
	}

}
