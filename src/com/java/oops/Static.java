package com.java.oops;

public class Static {
	
	/**
	 * static is keyword it is used in class,variable,method and block
	 * static is depends on class not depend on instance of class
	 * it can be accesed without creating object
	 */
	
	/* 
	 * static method
	 */
	static void myMethod()
    {
        System.out.println("myMethod");
    }
	
	/*
	 * static variable
	 */
	static int a =7;
	static int b;
	
	/*
	 * static block
	 */
	static{
		 a = 10;
		 b = 6; 
	}

	private static String myStr = "hello";
	
	static class MyNestedClass{
		//non-static method
		public void disp() {

		   /* If you make the str variable of outer class
		    * non-static then you will get compilation error
		    * because: a nested static class cannot access non-
		    * static members of the outer class.
		    */
//		   System.out.println(str); 
		}
	
	}
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
    	
           myMethod();
           
          
           System.out.println("value of a "+a);
           System.out.println("value of b "+b);
    }

}
