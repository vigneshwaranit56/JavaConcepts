package com.java.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	static Stack<Character> operators = new Stack<Character>();
	public static void main(String argv[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			
			String infix = sc.next();
			//output as postfix
			String postfix = toPostfix(infix);
			
			if(postfix == null){
				System.out.println();
				
			}else			
			System.out.println(postfix);
		}
	
		
		sc.close();
		
		
	}
	
	private static String toPostfix(String infix)
	//converts an infix expression to postfix
	{
		char symbol;
		String postfix = "";
		
                for(int i=0;i<infix.length();++i)
					//while there is input to be read
		{
			symbol = infix.charAt(i);
			//if it's an operand, add it to the string
                        if (Character.isLetter(symbol))
				postfix = postfix + symbol;
			else if (symbol=='(')
			//push (
			{
				operators.push(symbol);
			}
			else if (symbol==')')
			//push everything back to (
			{
				while (operators.peek() != '(')
				{
					postfix = postfix + operators.pop();
				}
				operators.pop();		//remove '('
			}
			else
			//print operators occurring before it that have greater precedence
			{
                                while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))
					postfix = postfix + operators.pop();
				
				operators.push(symbol);
			}
		}
		while (!operators.isEmpty())
			postfix = postfix + operators.pop();
		return postfix;
	}
	
	
	static int prec(char x)
	{
		if (x == '+' || x == '-')
			return 1;
		if (x == '*' || x == '/' || x == '%')
			return 2;
		return 0;
	}

}
