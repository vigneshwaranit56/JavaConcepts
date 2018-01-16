package com.java.oops;

public class RunTimePolymorphism  extends BaseClass{
	
	/**
	 * method over riding is happening  baseclass and dervied class where same method name
	 * derived class override base class
	 */
	
	public void shape(String shape){
		System.out.println("area of "+shape+" overriding");
		
	}
	
	public static void main(String args[]){
		
		BaseClass baseClass = new RunTimePolymorphism();
		baseClass.shape("circle");
		/**
		 * new RunTimePolymorphism() is overriding base class over derived class method
		 */
	}
	
	

}
