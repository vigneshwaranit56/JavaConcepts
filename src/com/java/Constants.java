package com.java;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	private static final HashMap<String, Integer> DAY_MAP = new HashMap<String, Integer>() {
		{
			put("Monday",1);
			put("Tuesday",2);
			put("Wednesday",3);
			put("Thursday",4);
			put("Friday",5);
			put("Saturday",6);
			put("Sunday",7);

			
			
		}
	};

	public static HashMap<String, Integer> getDayMaps() {
		return DAY_MAP;
	}
	
	private static final HashMap< Integer,String> DAY_NO_MAP = new HashMap<Integer,String>() {
		{
			put(1,"Monday");
			put(2,"Tuesday");
			put(3,"Wednesday");
			put(4,"Thursday");
			put(5,"Friday");
			put(6,"Saturday");
			put(7,"Sunday");

			
			
		}
	};

	public static HashMap<Integer,String> getNOMaps() {
		return DAY_NO_MAP;
	
	}
}
