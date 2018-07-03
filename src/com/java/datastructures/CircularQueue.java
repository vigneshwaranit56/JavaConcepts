package com.java.datastructures;

public class CircularQueue extends Queue {

	public CircularQueue(int size) {
		super(size);
	}

	public void enque(int element) throws Exception {

		if (isFull() && !(front == -1 && rear == -1))

		{
			System.out.println("rear" + rear);
			System.out.println("front" + front);
			if (rear - front > 0 && !(size == rear + front)) {
				rear = -1;
				front = front - rear + 1;

			} else
				throw new Exception("overflow");

		}
		arr[++rear] = element;
	}

	public int deque() throws Exception {
		System.out.println("rear" + rear);
		System.out.println("front" + front);
		if (isEmpty())
			throw new Exception("underflow");
		if (front == size - 1) {
			front = -1;
			rear = -1;
		}
		int index = ++front;
		int deque = arr[index];
		arr[index] = 0;
		return deque;
	}

	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue(5);
		queue.enque(5);
		queue.enque(4);
		queue.enque(3);
		queue.enque(2);
		queue.enque(1);
		queue.display();

		System.out.println(queue.rear);
		System.out.println(queue.front);
		queue.deque();
		queue.deque();
		queue.deque();
		queue.enque(1);
		queue.enque(3);
		queue.enque(2);
		queue.display();
		queue.display();

		System.out.println(queue.rear);
		System.out.println(queue.front);

		queue.deque();
		queue.display();

		queue.enque(2);
		queue.display();

		queue.deque();
		queue.deque();

		queue.enque(5);
		queue.deque();
		queue.deque();
		queue.enque(5);
		queue.deque();
		queue.deque();

		queue.enque(5);
		queue.enque(4);
		queue.enque(3);
		queue.enque(2);
		queue.enque(1);
		queue.deque();
		queue.deque();
		queue.deque();
		queue.deque();

		queue.display();

		System.out.println(queue.rear);
		System.out.println(queue.front);

	}

}
