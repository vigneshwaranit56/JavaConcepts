package com.java.basicprogram;

public class Pattern {

	public static void main(String[] args) {

		int start = 3;

		int index = 3;
		
	
		for (int i = 0; i < start; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(index);
			}
			index++;
			System.out.println();

		}

		for (int j = start; j >= 0; j--) {
			index--;
			for (int i = 0; i < j; i++) {

				System.out.print(index);

			}

			System.out.println();

		}

	}

}
