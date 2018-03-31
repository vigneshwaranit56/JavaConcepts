package com.java.oops;

public class SingleInheritance extends BaseClass {
	
	public double areaaOfCircle(int r){
		// here constant is base class variable
		double d = constant*r*r;
		
		System.out.println("area of circle "+d);
		return d;
	}

	public static void main(String[] args) {
	
		BaseClass singleInheritance = new SingleInheritance();
		singleInheritance.shape("circle");
//		singleInheritance.areaaOfCircle(5);
		singleInheritance.disp("circle");
		
		
		/**
		 * output :	shape iscircle
					area of circle 78.5
					circle done

		 */

	}

}
