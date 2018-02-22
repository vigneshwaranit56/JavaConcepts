package com.java.datastructures;

public class Queue {

	int arr[];
	// rear  enque
	int rear = -1;
	// front deque
	int front = -1;
	final int size;
	
	public Queue(int size) {	
		arr = new int[size];
		this.size = size;
	}
	
	public void enque(int element) throws Exception{
		
		if(isFull())
			throw new Exception("overflow");
		
		arr[++rear] = element;
	}
	
	public int deque() throws Exception{
		if(isEmpty())
			throw new Exception("underflow");
		int index = ++front;
		int deque = arr[index];
		arr[index] =0;
		return deque;
	}
	
	public boolean isEmpty(){
		return front == rear;
		
	}
	
	public boolean isFull(){
		return rear == size-1;
		
	}
	
	int front(){
		return arr[front];
	}
	
	int rear(){
		return arr[rear];
	}
	
	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		Queue queue = new Queue(5);
		queue.enque(5);
		queue.enque(4);
		queue.enque(3);
		queue.enque(2);
		queue.enque(1);
		
		
		queue.display();
		
		queue.deque();

		queue.deque();
		queue.deque();queue.deque();queue.deque();queue.deque();
		queue.display();
		
		System.out.println(queue.rear());
		System.out.println(queue.front());

	}

}
