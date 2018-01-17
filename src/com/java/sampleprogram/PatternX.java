package com.java.sampleprogram;

import java.util.Scanner;

public class PatternX {
	/**
	 * program
p     p
 r   r 
  o o  
   g   
  r r  
 a   a 
m     m
	 */

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	String str  = s.nextLine();
	
	for (int i = 0; i < str.length(); i++) {
	
		for (int j = 0; j < str.length(); j++) {
			
			if(i==j | i+j==str.length()-1)
				System.out.print(str.charAt(i));
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
	s.close();
	}

}
