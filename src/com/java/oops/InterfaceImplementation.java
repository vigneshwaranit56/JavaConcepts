package com.java.oops;

public class InterfaceImplementation implements Interface{

	
/** 
 * this methods are defined in interface and explaing it here
 */
	@Override
	public String sound() {
		String dog = "dog barks";
		System.out.println(dog);
		return dog;
	}

	@Override
	public String category() {
		String dog = "mamals";
		System.out.println(dog);
		return dog;
	}
	
	public static void main(String[] args) {
		
		InterfaceImplementation implementation = new  InterfaceImplementation();
		implementation.category();
		implementation.sound();
		/**
		 * we can't change variable which is declared in interface
		 */
		
 System.out.println(InterfaceImplementation.animal);
	}

}
