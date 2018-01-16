package com.java.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionClass {
	
	/**
	 * Errors indicate that something severe enough has gone wrong, the application should crash rather than try to handle the error.

	 * Exceptions are events that occurs in the code. A programmer can handle such conditions and take necessary corrective actions.
	 */
	/**
	 * dived by zero exception
	 */
	public void arithmeticException() {
		int x = 7;
		int y = 0;

		try {

			y = x / y;

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	/**
	 * accessing null objects and varibles
	 */
	public void nullPointerExpection() {

		String s1 = null;

		try {
			s1.charAt(0);
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

	/**
	 * Accessing index over capacity of array
	 */
	public void arrayIndexOutOfBoundException() {
		int a[] = { 8, 7, 8, 9 };
		try {
			a[7] = 8;
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	/**
	 * 
	 * can't able to get a file
	 */

	public void fileNotFoundException() {
		try {

			// Following file does not exist
			File file = new File("E://file.txt");

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	/**
	 * storing string instead of int in below example
	 */

	public void numberForatException() {
		try {

			int num = Integer.parseInt("pakki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	/**
	 * casting string to number
	 */
	public void classCastException(){
		try {
			Object i = Integer.valueOf(42);
			String s = (String)i;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		ExceptionClass exceptionClass = new ExceptionClass();
		// exceptionClass.nullPointerExpection();
		exceptionClass.classCastException();

	}

}
