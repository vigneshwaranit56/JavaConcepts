package com.java.Exception;

public class MyException extends Exception{
	
	public MyException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		/**
		 * custom exception handling 
		 */
	int age =13;
		if(age<18)
			try {
				throw new MyException("you can't give vote, your age is below 18");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

	}

}
