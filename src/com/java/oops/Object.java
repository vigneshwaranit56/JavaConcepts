package com.java.oops;

public class Object {
	int a;
	int b;
	
	/*
	 * constructor is same class name as method name 
	 * default constructor we can use for creating instanace
	 * parameterized constructor
	 */
public Object(int a,int b) {
	this.a = a;
	this.b = b;
}

public int add(){
	int ret = a+b;
	System.out.println("in addtion operation "+ret);
	return ret;
}

public static void main(String[] args){
	
	/**
	 * classname ob_name = new constructor of the class;
	 */
	Object obj = new Object(5, 6);// object creation
	obj.add();
	
	/**
	 * output:
	 * 
	 * in addtion operation 11

	 */
	
}
}
