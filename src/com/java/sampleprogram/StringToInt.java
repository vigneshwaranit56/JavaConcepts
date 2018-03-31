package com.java.sampleprogram;

public class StringToInt {

	/**
	 * converting string to number without using in built library
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
//		
//
//		double st = stringToint("25");
//		System.out.println(st);
		
		System.out.println(2500/Math.pow(10, 2));
		

	}

	public static double stringToint(String str) throws Exception {
		int length = str.length();
		System.out.println("length" + length);

		int number = 0;

		int pow = str.indexOf("."); // checking decimal value

		boolean isNegative = false;
		int j = 0;
		if ((str.charAt(0) + "").contains("-")) { // checking it is negative
													// value
			j = 1;
			isNegative = true;

		}

		int arr[] = new int[length];

		int l = 0;
		for (int i = j; i < arr.length; i++) {
			int n = str.charAt(i);

			if (n < 48) {
				System.out.println(i + "index"); // skipping . and - ascii
													// values
				continue;
			}

			if (n > 65 || n > 97)
				throw new Exception("invalid number"); // throwing exception
														// string contains char

			arr[l] = str.charAt(i) - 48; // converting into ascii vales
			l++;
		}

		int factor = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr.length - 1 == i)
				factor *= 1;
			else
				factor *= 10; // multiplying digits from reverse of array

			number += arr[i] * factor;// adding it with values

		}

		double d = number;

		if (pow != -1)
			d = number / Math.pow(10, l);// for decimal values

		if (isNegative)
			d = 0 - d; // for negative values

		return d;
	}

}
