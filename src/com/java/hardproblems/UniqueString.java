package com.java.hardproblems;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueString {
	
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String str = s.nextLine();
			
			TreeSet<String> set = new TreeSet<String>();
			
			for (int j = 1; j <= str.length(); j++) {
				
				set.addAll(splitBy(str,j));
			}
			
		}
		
	}

	private static Collection<? extends String> splitBy(String str, int j) {
		TreeSet<String> set = new TreeSet<String>();
		
		for (int i = 0; i < str.length(); i++) {
System.out.println(i+"--"+j);
			set.add(str.substring(i, j));
		}
		
		System.out.println(set);
		
		
		return set;
	}

	

}
