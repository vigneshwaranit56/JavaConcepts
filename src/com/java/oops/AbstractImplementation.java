package com.java.oops;

public class AbstractImplementation extends AbstractClass{

	@Override
	public void sound() {
System.out.println("Dog barks");
		
	}
	
	public static void main(String[] args) {
	AbstractImplementation abstractImplementation = new AbstractImplementation();
	abstractImplementation.sound();
	// here variable value of h can be changed at anywhere 
	abstractImplementation.h = 7;
	
	}

	

}
