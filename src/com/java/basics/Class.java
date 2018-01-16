package com.java.basics;

public class Class {

	/*
	 * class is custom data type which we can create
	 * here Class is a class name 	 
	 */
	
	public static void main(String[] args){
		/**
		 * java always starts with static method
		 */
		
		/*
		 * public is one of access modifier we can access with in the package
		 * 
		 * static is keyword which we can use without creating object
		 * 
		 * void is one of return type use of this is it doesn't return any value
		 * 
		 * main method name
		 * 
		 * args is command line argument
		 * 
		 */
		
		/**
		 * package contains group class of objects
		 */
		
		String args0 = args[0];
		String args1 = args[1];
		String args2 = args[2];
		String args3 = args[3];
		String args4 = args[4];
		System.out.println(args[1]);
		
		
		/**
		 * above program gives run time Exception as Array index out of bound exception
		 */
		/*
		 * because of args as Array size we doesn't  mention it;
		 * 
		 */
		
		
		
		int a[] = null;// like args in main method
		
		System.out.println(a[0]);
		
		
	}
}
