package com.java.sampleprogram;

import java.util.Scanner;
import java.util.Stack;

public class ChefStackWithQuery {

	
	/*
	 * 1) Customer Query:
When a customer demands a package, the food package on the top of the pile is given and the customer is charged according to the cost of the package. This reduces the height of the pile by 1. 
In case the pile is empty, the customer goes away empty-handed.

2) Chef Query:
The chef prepares a food package and adds it on top of the pile. And reports the cost of the package to the Manager.
Help him manage the process.

Input:
First line contains an integer Q, the number of queries. Q lines follow.
A Type-1 ( Customer) Query, is indicated by a single integer 1 in the line.
A Type-2 ( Chef) Query, is indicated by two space separated integers 2 and C (cost of the package prepared) .

Output:
For each Type-1 Query, output the price that customer has to pay i.e. cost of the package given to the customer in a new line. If the pile is empty, print "No Food" (without the quotes).

Constraints:
1 ≤ Q ≤ 105
1 ≤ C ≤ 107

SAMPLE INPUT 
6
1
2 5
2 7
2 9
1
1
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();
		
		int t = s.nextInt();
		
		for (int i = 0; i < t; i++) {
			int query = s.nextInt();
			
			if(query == 2)
				stk.push(s.nextInt());
			else{
				
				if(stk.isEmpty())
					System.out.println("No Food");
				else 
					System.out.println(stk.pop());
			}
				
			
			
		}
		
		s.close();
		

	}

}
