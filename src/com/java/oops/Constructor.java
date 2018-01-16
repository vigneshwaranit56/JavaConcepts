package com.java.oops;

public class Constructor {
	
	/**
	 * default Constructor
	 */
	public Constructor() {
System.out.println("default constructor");
	}
	
	Constructor(int a){
		System.out.println("area of a circle "+a*a);
	}
	
	Constructor(int l,int b){
		System.out.println("area of rectangle "+l*b);
	}

	public static void main(String[] args) {
		new Constructor();
		new Constructor(5);
		new Constructor(5,6);
		
		

	}

}
