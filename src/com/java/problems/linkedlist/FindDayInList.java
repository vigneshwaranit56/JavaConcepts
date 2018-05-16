package com.java.problems.linkedlist;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.java.Constants;

public class FindDayInList {

	public NodeD root;

	public void push(int value) {
		NodeD node = new NodeD(value);
		node.next = root;
		node.prev = null;

		if (root != null)
			root.prev = node;

		root = node;
	}

	public void printDList() {
		NodeD last = null;
		/**
		 * printing next
		 */
		NodeD parent = root;

		while (parent != null) {
			System.out.print(parent.value + " ");
			last = parent;
			parent = parent.next;

		}

		System.out.println();
		/**
		 * printing prev
		 */
		while (last != null) {
			System.out.print(last.value + " ");
			last = last.prev;
		}

	}

	public void makeCircularLink() {

		NodeD parent = root;
		/**
		 * printing next
		 */
		while (parent.next != null) {
			parent = parent.next;
		}

		parent.next = root;
		root.prev = parent;

	}

	public static void main(String[] args) {

		FindDayInList f = new FindDayInList();

		f.push(1);
		f.push(2);
		f.push(3);
		f.push(4);
		f.push(5);
		f.push(6);
		f.push(7);

		f.makeCircularLink();
//		System.out.println(f.getDayAddition("Friday", -28));
		
		System.out.println(f.dayAddition("Sunday",6 ));

	}

	private String getDayAddition(String day, int addition) {

		NodeD dayNode = getDayNode(day);
		System.out.println("--day--" + dayNode.value);

		int i = 0;

		Boolean isprev = false;

		if (addition < 0)
			isprev = true;

		System.out.println("--prev--" + isprev);
		
		addition = addition%7;
		

		while (i != addition) {
			System.out.println(i + "--in while--" + dayNode.value);

			if (isprev) {
				dayNode = dayNode.next;
				i--;

			} else {
				dayNode = dayNode.prev;
				i++;

			}

		}

		System.out.println(dayNode.value);

		Map<Integer, String> dayMap = new HashMap<Integer, String>(Constants.getNOMaps());

		return dayMap.get(dayNode.value);

	}

	private NodeD getDayNode(String day) {

		Map<String, Integer> dayMap = new HashMap<String, Integer>(Constants.getDayMaps());

		Integer value = dayMap.get(day);

		System.out.println("---v---" + value);

		NodeD parent = root;

		while (parent != null && parent.value != value)
			parent = parent.next;

		System.out.println(parent.value);

		return parent;
	}
	
	private String dayAddition(String day ,int no){

		Map<String, Integer> dayMap = new HashMap<String, Integer>(Constants.getDayMaps());

		Integer value = dayMap.get(day);

		Integer dayTo = 0;
		System.out.println(value);

		if (no < 0)
			no = no * (-1);

		dayTo = 7 + value + no;

		System.out.println(dayTo);

		dayTo = dayTo % 7;

		System.out.println(dayTo);
		Map<Integer, String> dayToMap = new HashMap<Integer, String>(Constants.getNOMaps());

		return dayToMap.get(dayTo);
		
		
	}
	
	
	
}
