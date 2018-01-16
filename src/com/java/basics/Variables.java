package com.java.basics;

public class Variables {
	
	/**
	 * instance variable
	 * static variable
	 * local varible
	 * final keyword with variables
	 */
	
	/*
	 * syntax for creating variablename data_type variable_name = value;
	 */

	// datatype is String,int,float,double,boolean
	
	private String shape = "circle";// instance  variable
	
	//inside the class which is called instance variable
	
	private static double radius = 6 ; // static varaiable
	
	// inside the class with static keyword  is called static varible,
	
	//we can use by classname.variable name
	
	private final double  constant = 3.14; // final keyword with variable
	
	// we cannot change or update when we initialized a variable with fianl keyword
	
	public int radiusOfCircle(){
		
		//area of circle π r2
		
		int area = 0; // local variable
		// inside the method aand it scope is with the mehtod only
		
		area =	(int) (constant*Variables.radius*Variables.radius);
		
		
		System.out.println("area of"+shape+"= "+area);
		// here + is doing concatination operation
		
		return area;
	}

}
