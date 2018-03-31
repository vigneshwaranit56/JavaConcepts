package com.java.stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringReduce {

	
	static String super_reduced_string(String s){
//		
//		Map<Character,Integer> mapCount = new TreeMap<Character,Integer>();
//		char[] ch = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if(mapCount.containsKey(ch[i]))
//				mapCount.put(ch[i],mapCount.get(ch[i])+1);
//			else
//				mapCount.put(ch[i], 1);
//			
//		}
//				
//		StringBuilder sb = new StringBuilder();
//		for (Map.Entry<Character, Integer> e : mapCount.entrySet()) {
//
//			if(e.getValue()%2 != 0)
//				sb.append(e.getKey());
//				
//			
//			
//		}
//		
//		if(sb.toString().isEmpty())
//			return "EMPTY STRING";
//		
//		return sb.toString();
		
		 while (true) {
	            // Used for loop termination
	            int len = s.length();
	            
	            // "(.)" is a capturing group that captures any character
	            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
	            s = s.replaceAll("(.)\\1", "");
	            
	            // If no changes were made to string, break loop
	            if( s.length() == len ){
	                break;
	            }
	        }

	        return (s.isEmpty()) ? "Empty String" : s;
    }
	public static void main(String[] args) {

		System.out.println(super_reduced_string("acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj"));
	}

}
