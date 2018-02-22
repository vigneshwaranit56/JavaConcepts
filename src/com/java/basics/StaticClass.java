package com.java.basics;

public class StaticClass {
	
	static int j = 10;
	static int  k =func();
	static{
		System.out.println("hi");
	}
	private static int func() {
		System.out.println("hello");
		return k;
	}
	public static void main(String[] args) {
System.out.println("j = "+j+"k ="+k);

	}

	

}
