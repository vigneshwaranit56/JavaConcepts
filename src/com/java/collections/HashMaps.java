package com.java.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collections;


public class HashMaps {
	/**
	 * HashMap is contains key and values
	 * This class makes no guarantees as to the order of the map
	 * it accepts null key and null value
	 * It is not an ordered collection which means it does not return ]
	 * the keys and values in the same order in which they have been inserted into the HashMap
	 * 
	 */

	public static void main(String[] args) {
		 /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      hmap.put(3, "Anuj");
	    
	       
System.out.println(hmap);
	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      
	      System.out.println();
	      
	      TreeMap<Integer,String> map = new TreeMap<Integer,String>(hmap);
	      
	      for(Map.Entry<Integer,String> eMap:map.entrySet()){
	    	  System.out.println("key is: "+eMap.getKey()+" & Value is "+eMap.getValue());
	      }
	      
	      
	      
	      
	      for(Map.Entry<Integer,String> eMap:map.entrySet()){
	    	  System.out.println("key is: "+eMap.getKey()+" & Value is "+eMap.getValue());
	      }
	      
	      
	    
	}
	
	 private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

	        // 1. Convert Map to List of Map
	        List<Map.Entry<String, Integer>> list =
	                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

	        // 2. Sort list with Collections.sort(), provide a custom Comparator
	        //    Try switch the o1 o2 position for a different order
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1,
	                               Map.Entry<String, Integer> o2) {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });

	        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
	        Map<String, Integer> sortedMap = new HashMap<String, Integer>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        /*
	        //classic iterator example
	        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
	            Map.Entry<String, Integer> entry = it.next();
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }*/


	        return sortedMap;
	    }

}
