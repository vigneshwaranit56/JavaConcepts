package com.java.oops;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
	Overloading overloading = new Overloading();
	
	overloading.demo(5.5);
	overloading.demo(7,6);
	double result =overloading.demo(8.8);
    System.out.println("O/P : " + result);
	
	}

}
