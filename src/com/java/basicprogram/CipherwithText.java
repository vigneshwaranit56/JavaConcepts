package com.java.basicprogram;

import java.util.Scanner;

public class CipherwithText {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String txt = s.next();
		int k = s.nextInt();
		cipherText(txt, k);

		s.close();
	}

	private static void cipherText(String txt, int k) {

		String cipherText = "";

		for (int i = 0; i < txt.length(); i++) {

			char ch = txt.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {

				if (ch >= 'a' && ch <= 'z') {
					int ascii = ch + k;
					if (ascii > 'z') {
						ascii = ascii - 'z'-1;
						ch = ((char) (ascii + 'z'));
					} else

						ch = (char) ascii;

				} else if (ch >= 'A' && ch <= 'Z') {
					int ascii = ch + k;
					if (ascii > 'Z') {
						ascii = ascii - 'Z'-1;
						ch = ((char) (ascii + 'A'));
					} else
						ch = (char) ascii;

				} else if (ch >= '0' && ch <= '9') {
				
					int ascii = ch + k;

					if (ascii > '9') {
						ascii = ascii - '9' - 1;

						int in = '0';
						ch = ((char) (ascii + in));

					} else
						ch = (char) ascii;

				}
				cipherText += ch + "";

			} else
				cipherText += ch + "";

		}
		System.out.println(cipherText);

		// Epp-gsrzsCw-3-fi:Epivx5.
		// Epp-gsrzswfiEpivx5

	}

}
