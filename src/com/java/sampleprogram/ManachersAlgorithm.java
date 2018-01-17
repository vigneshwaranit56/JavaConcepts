package com.java.sampleprogram;

public class ManachersAlgorithm {

	public static void main(String[] args) {
	System.out.println(getLongestpalindrome("aadmadamdjksdah"));
	}

	private static String getLongestpalindrome(String string) {
	
	final int length  = string.length();
		
//		int arrLength[] = new int[length*2];
		char[] ch = new char[length*2+1];
		
		for (int i = length-1; i>=0; i--) {
			ch[2*i+1]  = string.charAt(i);
			ch[2*i] = '#';
		}
		
		ch[2 * length] = '#';

        final int arrLength = length * 2;
        
        
        final int[] LPS = new int[arrLength + 1];
        int p = 0;
        for (int i = 1; i <= arrLength; i++) {
        	LPS[i] =0;
        	 if (LPS[p] + p >= i)            	
                 LPS[i] = Math.min(LPS[2 * p - i], p + LPS[p] - i);
             while (i + LPS[i] + 1 <= arrLength && i - LPS[i] - 1 >= 0 && ch[i + LPS[i] + 1] == ch[i - LPS[i] - 1])
                 LPS[i]++;
             if (p + LPS[p] < i + LPS[i])
                 p = i;       		
        	
        	
        	
		}
        
      
        
        for (int i = 0; i < LPS.length; i++) {
			System.out.println(LPS[i]);
		}
        // find the palindrome with the biggest span
        int valueMax = 0;
        int indexMax = 0;
        for (int i = 0; i < arrLength; i++) {
            if (valueMax < LPS[i]) {
                valueMax = LPS[i];
                indexMax = i;
            }
        }

        // reconstruct the palindrome given its index in LPS and span
        final int palindromeSpan = valueMax / 2;
        if (indexMax % 2 == 0) {
            return string.substring(indexMax/2  - palindromeSpan, indexMax/2 + palindromeSpan);
        } else {
            return string.substring(indexMax/2  - palindromeSpan, indexMax/2 + palindromeSpan + 1);
        }
	}

}
