package com.java.basics;

import org.omg.CosNaming.IstringHelper;

public class DataTypes {
	/**
	 * Datatype is a variable which type it can take
	 * java is typed language
	 * 1) primitive data type
	 * 2) referenced data type
	 */
	
	/*
	 * below data types are primitive data type
	 */
	
	boolean isTrue;	// default value  = false and it's size 1 bit
	char c;  // default value  = '/u0000' and it's size 2 byte
	byte by; // default value  = 0 and it's size 1 byte	
	short s; // default value  = 0 and it's size 2 byte
	
	int number; // default value  = 0 and it's size 4 byte
	long l; // default value  = 0L and it's size 4 byte
	float f; // default value  = 0.0f and it's size 4 byte
	double d; // default value  = 0.0d and it's size 4 byte
	
/*
 * referenced data type
 */
	String str = "string";
	

	public static void main(String[] args) {
		/**
		 * above variables are instance variable, 
		 * if we want to use instance variable, we have to create object for it
		 */
		
		DataTypes dataTypes = new DataTypes();// object creation
	//   new keyword is used to create object
		
		System.out.println("boolean data type"+dataTypes.isTrue);
		System.out.println("char data type"+dataTypes.c);
		System.out.println("byte data type"+dataTypes.by);
		System.out.println("short data type"+dataTypes.s);
		System.out.println("int data type"+dataTypes.number);
		System.out.println("float data type"+dataTypes.f);
		System.out.println("double data type"+dataTypes.d);		
		System.out.println("long data type"+dataTypes.l);
		System.out.println("String data type"+dataTypes.isTrue);

	}

}
