package com.java.sampleprogram;

import java.util.Scanner;
import java.util.Stack;

public class FootballwithStack {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		Stack<Integer> stk = new Stack<Integer>();

		for (int i = 0; i < t; i++) {

			int noOfPasses = s.nextInt();
			int firstPass = s.nextInt();

			while (!stk.empty())
				stk.pop();

			stk.push(firstPass);

			for (int j = 0; j < noOfPasses; j++) {

				char ch = s.next().charAt(0);

				if (ch == 'B') {
					int second = stk.pop();
					int first = stk.pop();
					stk.push(second);
					stk.push(first);

				}else					
					stk.push(s.nextInt());

				
				
			}
			System.out.println("Player " + stk.peek());
		}

		s.close();

	}

}
