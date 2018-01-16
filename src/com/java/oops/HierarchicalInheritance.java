package com.java.oops;

public class HierarchicalInheritance extends BaseClass{

	public double areaaOfCircle(int r){
		// here constant is base class variable
		double d = constant*r*r;
		
		System.out.println("area of circle "+d);
		return d;
	}	
	
	public static void main(String[] args) {

		HierarchicalInheritance inheritance = new HierarchicalInheritance();
		
		inheritance.shape("circle");
		inheritance.areaaOfCircle(7);
		inheritance.disp("circle");

	}
	

}

