package com.zet1;

import java.util.Scanner;

public class TwoDiensionalArrayString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// child
		String[] strarr1 = new String[4];
		// parent
		String[] strarr2 = new String[4];

		for (int i = 0; i < strarr1.length; i++) {
			strarr1[i] = s.nextLine();
			strarr2[i] = s.nextLine();

		}
		s.close();

		int count = 0;

		for (int i = 0; i < strarr2.length; i++) {

			if (strarr2[i].equalsIgnoreCase("ronaldo")) {
				String child = strarr1[i];
				System.out.println(child);
				for (int j = 0; j < strarr2.length; j++) {
					System.out.println(strarr2[j]);
					if (strarr2[j].equalsIgnoreCase(child)) 
						count++;
					

				}

			}

		}
		System.out.println(count);
	}

}
