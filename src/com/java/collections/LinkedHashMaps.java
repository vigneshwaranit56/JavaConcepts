package com.java.collections;


import java.util.Iterator;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMaps {

	public static void main(String[] args) {
		 // HashMap Declaration
        LinkedHashMap<Integer, String> lhmap = 
                new LinkedHashMap<Integer, String>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");
        lhmap.put(null, null);

        // Generating a Set of entries
        Set<Entry<Integer, String>> set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator<Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)iterator.next();
           System.out.print("Key is: "+ me.getKey() + 
                   "& Value is: "+me.getValue()+"\n");
        }
        
        LinkedHashMap<Integer, Student> lchmap = 
                new LinkedHashMap<Integer, Student>();

        //Adding elements to LinkedHashMap
        lchmap.put(22, new Student(101, "Zues", 26));
        lchmap.put(33, new Student(102, "Zues", 25));
        lchmap.put(1, new Student(103, "Zues", 18));
        lchmap.put(2, new Student(104, "Zues", 16));
        lchmap.put(100,new Student(105, "Zues", 29));
       
        
      
	}

}
