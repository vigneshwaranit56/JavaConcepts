package com.java.oops;

public class Overloading {
/**
 * method overloading ability take more than one form
 * same method name different arguments
 * also it called as compile time polymorphism
 *
 */
	void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }

}
