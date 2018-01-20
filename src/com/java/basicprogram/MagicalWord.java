package com.java.basicprogram;

import java.util.Scanner;

public class MagicalWord {
	/**
	 * SAMPLE INPUT 1 6 AFREEN
	 * 
	 * SAMPLE OUTPUT CGSCCO Explanation ASCII values of alphabets in AFREEN are
	 * 65, 70, 82, 69 ,69 and 78 respectively which are converted to CGSCCO with
	 * ASCII values 67, 71, 83, 67, 67, 79 respectively. All such ASCII values
	 * are prime numbers.
	 * 
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int i = 0; i < t; i++) {

			int n = s.nextInt();

			String str = s.next();
			String ret = "";

			
			for (int j = 0; j < str.length(); j++) {
				int ascii = str.charAt(j);
				
//				if(('!'>ascii && ascii<'@')||('['>ascii && ascii<'`')||('{'>ascii&&ascii<'~')){
//					ret=ret+"C";
//					continue;
//				}
				
				char chainc =0;
				char chadec =0;
				if(ascii<'a'){
					chainc ='A';
					chadec = 'Z';
				}
				else{
					chainc= 'a';
					chadec = 'z';
					
				}
				
				
				int incNear = incrementNear(ascii,chadec);
				int decNear = decrementNear(ascii,chainc);
				
				System.out.println("inc "+incNear+"  ascii "+ascii+"  dec "+decNear);
				
				if((incNear ==0)&& (decNear == 0))
				    System.out.println();
				else if(incNear ==0)
					ascii = decNear;
				else if(decNear == 0)
					ascii = incNear;					
				else if (ascii - decNear == incNear - ascii)
					ascii = decNear;
				else if (ascii - decNear < incNear - ascii)
					ascii = decNear;
				else
					ascii = incNear;

				char ch = (char) ascii;
				

				ret += ch + "";

			}
			System.out.println(ret);
		}
		
//		CYGqOqSaGYmggqCqqqSa
//		CYGqOqSeGYmggqCqqqSe

		s.close();
	}

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

	private static int decrementNear(int ascii, char ch) {

		for (int i = ascii; i >= ch; i--) {

			if (isPrime(i))
				return i;
		}

		return 0;
	}

	private static int incrementNear(int ascii, char ch) {
		

		for (int i = ascii; i < ch; i++) {
			if (isPrime(i))
				return i;

		}
		return 0;
	}

}
