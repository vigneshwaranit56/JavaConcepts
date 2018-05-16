package com.java.problems.linkedlist;

import java.util.HashSet;

public class SinglyLinkedList {
	public Node root;
	
	public void removeDups(){
		
		
		HashSet set = new HashSet();
		Node previous = null;
		Node n = root;
		while(n != null){
			
			if(set.contains(n.value)){
				previous.next = n.next;
			System.out.println("dups found"+n.value);
			}else
			{			
				set.add(n.value);
				previous = n;
			}
			n  = n.next;

			
			
		}
		print();
				
	}

	public <T> void add(T value) {

		Node child = new Node(value);
		child.next = root;
		root = child;

	}
	
	public static void main(String args[]){
		
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(12);
		linkedList.add(15);
		linkedList.add(5);
		linkedList.add(6);

		linkedList.print();
		linkedList.removeDups();
		
		linkedList.print();

		
		
	}

	private void print() {
		

		while(root != null){
			System.out.println("-->"+root.value+"-->");
			root = root.next;
		}
	}

}
