package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Java8Test {

	public static void main(String[] args) {
// functional Interface
//		FNExample example = ()->{int x =5;
//		int y = 6;
//		System.out.println("Decorating with curtains "+(x+y));};
//		example.decorateWithCurtains();
//		
//		// foreach
//		
//		 TreeMap<String,String> countryCapitalMap=new TreeMap<String,String>();
//		  countryCapitalMap.put("India","Delhi");
//		  countryCapitalMap.put("India","mumbai");
//		  countryCapitalMap.put("India","Chennai");
//
//		  countryCapitalMap.put("India","kochi");
//		  countryCapitalMap.put("Japan","Tokyo");
//		  countryCapitalMap.put("France","Paris");
//		  countryCapitalMap.put("Russia","Moscow");
//		  
//		HashMap<String, String> c = new HashMap<String, String>();
//
//		countryCapitalMap.forEach((k, v) -> {
//			if (c.containsKey(k))
//				c.put(k, c.get(k) + "," + v);
//			else
//				c.put(k, v);
//
//		});
//		
//		c.forEach((k,v)->System.out.println(k+" "+v));
		
		
		String str = null;
		String str1 = "hello";
		
		if(str1.equalsIgnoreCase(str))
			System.out.println("hello");
		else
			System.out.println("nope");

	}

}
