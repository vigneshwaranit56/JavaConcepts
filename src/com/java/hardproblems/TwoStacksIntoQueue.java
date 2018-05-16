package com.java.hardproblems;

import java.util.Scanner;
import java.util.Stack;

import com.java.datastructures.QueueUsingTwoStack.MyQueue;

public class TwoStacksIntoQueue {
	
	public static class MyQueue<T>{
		
		Stack<T> stack1 = new Stack<T>();
		Stack<T> stack2 = new Stack<T>();
		
		public void enqueue(T value){
			stack1.push(value);
		}
		
		public T peek(){
			
			if(size()== 0)
				return null;
			
			
			if(stack2.isEmpty())
				shiftStack();
				
			
			return stack2.peek();
		}

		public void shiftStack() {
			if(stack2.isEmpty()){
				while(!stack1.isEmpty())
					stack2.push(stack1.pop());
			}
						
						
				}
		
		public T dequeue(){
			
			if(size() == 0)
				return null;
			
			if(stack2.isEmpty())
				shiftStack();
			
			return stack2.pop();
		}
		public int size(){
			return stack1.size()+stack2.size();
		}
		
	}

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
	

}
