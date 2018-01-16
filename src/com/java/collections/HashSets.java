package com.java.collections;

import java.util.HashSet;

public class HashSets {
	/**
	 *Hastset uses hashtable implementation
	 * it doesn't maintains insertion order
	 * it doesn't allow duplicates if you add it will overwrite exiting one
	 * it doesn't allow null values if you add it will overwrite exiting one
	 * it is not synchronized
	 * it will comes under fail fast concurrent modification exception
	 */
	
	public static void main(String args[]){
		
		  // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);
	      
	      System.out.println(hset);
	}

}
