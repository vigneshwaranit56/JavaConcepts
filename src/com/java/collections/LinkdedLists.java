package com.java.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkdedLists {
	/**
	 * 
	 * LinkedList uses doubly linked data structure, so it uses two pointers
	 * here insertion and deletions is faster process
	 * memory usage is lesser
	 * traversal taking timed process
	 * if too much of insertion and deletion process needed then we can use linked list
	 * this is also not synchronized
	 * this also fail-fast while doing concurrent modification
	 */

	public static void main(String[] args) {
	LinkedList<Student> linkedList = new LinkedList<Student>();
	linkedList.add(new Student(101, "Zues", 26));
	linkedList.add(new Student(505, "Abey", 24));
	linkedList.add(new Student(809, "Vignesh", 32));
	Collections.sort(linkedList,Student.stuAge);
	
	System.out.println(linkedList);
	
	 linkedList.addFirst(new Student(105, "yuesss", 28));
     linkedList.addLast(new Student(102, "fuess", 23));
     
     System.out.println(linkedList);


	}

}
