package com.java.oops;

public class MultilevelInheritance extends SingleInheritance{
	
	public double perimeterOfCircle(int a){
	double d = 2*areaaOfCircle(a)/a;
	System.out.println("perimeter of circle "+d);
	return d;
}

	public static void main(String[] args) {
		
		MultilevelInheritance inheritance = new MultilevelInheritance();
		inheritance.shape("circle");
		inheritance.perimeterOfCircle(6);
		inheritance.disp("circle");
		
	}
}
