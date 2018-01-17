package com.java.sampleprogram;

import java.util.Scanner;

import com.java.oops.Static;

public class StringReverse {
	
	public static String[] arr;
	static int i =0;
	public static String recursion(String str){
		
		int limit =str.lastIndexOf(" ");
		
		if(limit == -1){
			System.out.print(str+" ");
			return str;
		}
		System.out.print(str.substring(limit,str.length())+" ");
		
		return recursion(str.substring(0, limit));
		
	}

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		recursion(str);

		s.close();
	}

}
