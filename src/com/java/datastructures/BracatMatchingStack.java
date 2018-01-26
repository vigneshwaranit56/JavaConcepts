package com.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class BracatMatchingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp =sc.next();
		
boolean val =balanceBracket(exp);

System.out.println(val?"yes":"no");

sc.close();

	}

	private static boolean balanceBracket(String exp) {
		Stack<Character>  stk= new Stack<Character>();

		for (int i = 0; i <exp.length(); i++) {
			
			if(exp.charAt(i)==')'){
				if(!stk.isEmpty() && stk.peek() =='('){
					stk.pop();
				}else
					return false;
				
			}else if(exp.charAt(i)==']'){
				if(!stk.isEmpty() && stk.peek() =='['){
					stk.pop();
				}else
					return false;
			}else if(exp.charAt(i)=='}'){
				if(!stk.isEmpty() && stk.peek() =='{'){
					stk.pop();
				}else
					return false;
				
			}else
				stk.push(exp.charAt(i));
			
		}

		if(stk.isEmpty())
			return true;
		else
			return false;
		
	}

}
