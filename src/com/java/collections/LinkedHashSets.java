package com.java.collections;

import java.util.LinkedHashSet;

public class LinkedHashSets {

	
	/**
	 * it doesn't have null and duplicate values
	 * LinkedHashSet maintains the insertion order. 
	 * Elements gets sorted in the same sequence in which they have been added to the Set.
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        lhset.add(null);
        lhset.add(null);
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);

	}

}
