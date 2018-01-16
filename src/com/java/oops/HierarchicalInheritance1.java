package com.java.oops;

public class HierarchicalInheritance1 extends BaseClass{
	
	public double areaaOfSphere(int r){
		// here constant is base class variable
		double d = 4*constant*r*r;
		
		System.out.println("area of sphere "+d);
		return d;
	}
public static void main(String[] args) {
	HierarchicalInheritance1 inheritance = new HierarchicalInheritance1();
	
	inheritance.shape("sphere");
	inheritance.areaaOfSphere(7);
	inheritance.disp("sphere");
	}

}
