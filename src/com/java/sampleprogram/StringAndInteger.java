package com.java.sampleprogram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAndInteger {

	public static void main(String[] args) {
	//	a1b12
	//abbbbbbbbbbbbbb
		Scanner s = new Scanner(System.in);
		String txt = s.nextLine();
		    String patt = "([a-z])([0-9]*)"; 
		    Pattern pattern = Pattern.compile(patt);
		    Matcher matcher = pattern.matcher(txt);

		    while(matcher.find()) {
		        String letter = matcher.group(1);
		        String number =  matcher.group(2);
		        System.out.println(number);
		        int num = Integer.valueOf(number);
		        while (num > 0) {
		            System.out.println(letter);
		            num--;
		        }
		    }

	}

}
