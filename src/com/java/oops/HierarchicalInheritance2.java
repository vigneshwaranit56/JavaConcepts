package com.java.oops;

public class HierarchicalInheritance2 extends BaseClass{
	
public double areaaOfCylinder(int r,int h){
	// here constant is base class variable
	double d = constant*r*r*h;
	
	System.out.println("area of cylinder "+d);
	return d;
}

	public static void main(String[] args) {
HierarchicalInheritance2 inheritance = new HierarchicalInheritance2();
		
		inheritance.shape("cylinder");
		inheritance.areaaOfCylinder(7,9);
		inheritance.disp("cylinder");
	}

}
