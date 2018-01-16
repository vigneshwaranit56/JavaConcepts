package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLists {

	
	public static void main(String[] args) {
		
		/**
		 * array list collection of single type of data to be stored
		 * null values can be accepted
		 * duplicate values also
		 * searching operation is done fast 
		 * maintains insertion order
		 * if there are less add and remove operations and more search operations requirement,
		 *  ArrayList would be your best bet.
		 *  synchronized is not applicable
		 *  The iterator and listIterator returned by these classes are fail-fas
		 */
		  List<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  obj.add(null);
		  obj.add(null);
		  System.out.println(obj);
		  
		  /*Unsorted List: ArrayList content before sorting*/
		   System.out.println("Before Sorting:");
		   
		   Collections.sort(obj);
		   
		   for(String str: obj){
				System.out.println(str);
			}

		   /* Sorting in decreasing order*/
		   Collections.sort(obj, Collections.reverseOrder());

		   /* Sorted List in reverse order*/
		   System.out.println("ArrayList in descending order:");
		   for(String str: obj){
				System.out.println(str);
			}
		   
		   
		   

		   ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
		  
		   ArrayList<Student> arraylistss = new ArrayList<Student>();
		   arraylistss.add(new Student(101, "Zues", 26));
		   arraylistss.add(new Student(505, "Abey", 24));
		   arraylistss.add(new Student(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylistss, Student.StuNameComparator);

		   for(Student str: arraylistss){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylistss, Student.StuRollno);
		   for(Student str: arraylistss){
				System.out.println(str);
		   }
		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylistss, Student.stuAge);
		   for(Student str: arraylistss){
				System.out.println(str);
		   }

	}

}
