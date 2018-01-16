package com.java.basics;

public class Operators {

	public int arithmeticOperation() {
		int ret = 0;

		// adding two numbers

		ret = 5 + 6;

		// subration two numbers

		ret = 5 - 6;

		// multiplication two numbers

		ret = 5 * 6;

		// division two numbers

		ret = 6 * 2;

		return ret;
	}

	public int assignmentOperators() {
		/*
		 * Assignments operators in java are: =, +=, -=, *=, /=, %=
		 */
		int num1 = 10;
		int num2 = 20;

		num2 = num1;
		System.out.println("= Output: " + num2);

		num2 += num1; // this equivalent to num2 = num2+num1;
		System.out.println("+= Output: " + num2);

		num2 -= num1; // this equivalent to num2 = num2-num1;
		System.out.println("-= Output: " + num2);

		num2 *= num1; // this equivalent to num2 = num2*num1;
		System.out.println("*= Output: " + num2);

		num2 /= num1; // this equivalent to num2 = num2/num1;
		System.out.println("/= Output: " + num2);

		num2 %= num1; // this equivalent to num2 = num2%num1;
		System.out.println("%= Output: " + num2);
		return num2;
	}

	public void incrementalOperator() {

		/**
		 * ++ , --
		 */
		int num1 = 1;
		

		System.out.println(++num1+"pre increment");
		// here can't able to use like this "pre increment"+++num1,
		// because compiler is confusing with +++num1 operator 

		System.out.println("post increment" + num1++);
		System.out.println("pre decrement" + --num1);
		System.out.println("post decrement" + num1--);
	}

	public void logicalOperator(){
		/**
		 * && AND
		 * || OR
		 * ! NOT
		 */
		boolean isValue = false;
		boolean iskey = false;
		
		System.out.println("&& opeartor"+(iskey && isValue));
		System.out.println("|| opeartor"+(iskey || isValue));
		System.out.println(" ! opeartor"+!(iskey && isValue));
	}
	
	public void relationalOperator(){
		/**
		 * <,  lesser than
		 * >,  greater than
		 * ==, equal to
		 * !=, not equal to
		 * <=, lesser than or equal to
		 * >=  greater than or equal to
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("lesser than"+(num1<num2));
		System.out.println("greater than"+(num1<num2));
		System.out.println("equal to"+(num1==num2));
		System.out.println("not equal to"+(num1!=num2));
		System.out.println("lesser than or equal to"+(num1<num2));
		System.out.println("greater than or equal to"+(num1<num2));
		
		
		
		
	}
	
	public void ternaryOperator(){
		/*
		 * variable num1 = (expression) ? value if true : value if false
		 */
		
		
		int num1 = 10;
		int num2;
		
		num2  = (num1 == 10)? 100:200;
		
		System.out.println("-ternary operator-"+num2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
