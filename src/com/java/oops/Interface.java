package com.java.oops;

public interface Interface {
	public String animal = "animal";
	
	public String sound();
	public String category();
	/**
	 * only public access modifier used and final and static variable in it
	 */

	public default String emPtyString(){
		
		
		return null;
		
	}
}
