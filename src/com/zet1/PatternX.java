package com.zet1;

import java.util.Scanner;

public class PatternX {
/**
 * Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 
 * @param args
 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				
				if(i==j ||  i+j==str.length()-1)
					System.out.print(str.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}
