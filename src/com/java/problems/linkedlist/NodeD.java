package com.java.problems.linkedlist;

public class NodeD<T> {
	
	public NodeD<T> prev;
	public T value;
	public NodeD<T> next;
	
	
	public NodeD(T value){
		this.value = value;
		prev= null;
		next = null;
		
	}
	

}
