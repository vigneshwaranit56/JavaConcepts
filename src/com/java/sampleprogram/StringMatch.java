package com.java.sampleprogram;

import java.util.Scanner;

public class StringMatch {
	
	public static int subStringIndex(String str, String substr) {
	    int substrlen = substr.length();
	    int strlen = str.length();
	    int j = 0;

	    if (substrlen >= 1) {
	        for (int i = 0; i < strlen; i++) {              // iterate through main string
	            if (str.charAt(i) == substr.charAt(j)) {    // check substring
	                j++;                                    // iterate
	                if (j == substrlen) {                   // when to stop
	                    return i - substrlen+1; //found substring. As i is currently at the end of our substr so sub substrlen
	                }
	            }
	            else {
	                j = 0;
	            }
	        }
	    }
	    return -1;
	}


	public static void main(String[] args) {
	System.out.println(StringMatch.subStringIndex("test123String", "String"));
	
	}

}
