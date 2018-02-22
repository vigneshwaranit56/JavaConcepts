package com.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class BracatMatchingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		String[] s = new String[n];
		
		for (int i = 0; i < n; i++) 
			s[i] = sc.next();
		
		for(String ss:braces(s))
			System.out.println(ss);
	

sc.close();

	}
	
static String[] braces(String[] values) {
	String[] strArr = new String[values.length];
	int i = -1;
	for (String string : values) {
		
		boolean val =balanceBracket(string);
		i++;
		if(val)
			strArr[i] = "YES";
		else
			strArr[i] = "NO";
		
	}
	
	
	
	return strArr;

        
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
