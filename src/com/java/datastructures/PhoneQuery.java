package com.java.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.java.collections.Student;

public class PhoneQuery {

	@Override
	public String toString() {
		return "PhoneQuery [os=" + os + ", ramSize=" + ramSize + ", inbuiltMemory=" + inbuiltMemory + ", price=" + price
				+ ", rating=" + rating + "]";
	}

	private String os;
	private int ramSize;
	private int inbuiltMemory;
	private int price;
	private int rating;
	
	
	
	public PhoneQuery(String os, int ram, int memory, int price, int rating) {
		this.os =os;
		this.ramSize =ram;
		this.inbuiltMemory = memory;
		this.price = price;
		this.rating = rating;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public int getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public int getInbuiltMemory() {
		return inbuiltMemory;
	}


	public void setInbuiltMemory(int inbuiltMemory) {
		this.inbuiltMemory = inbuiltMemory;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public static Comparator<PhoneQuery> ratingComparator = new Comparator<PhoneQuery>() {

		public int compare(PhoneQuery s1, PhoneQuery s2) {
int rating1 = s1.getRating();
		  int rating2 = s2.getRating();

		   return rating2-rating1;
		 
	    }};


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List<PhoneQuery> list = new ArrayList<PhoneQuery>();
		
		for (int i = 0; i < n; i++) {
			String os = s.next();
			int ram = s.nextInt();
			int memory = s.nextInt();
			int price = s.nextInt();
			int rating = s.nextInt();;
			
			list.add(new PhoneQuery(os,ram,memory,price,rating));
			
		}
		
		
		Collections.sort(list,PhoneQuery.ratingComparator);
		for (PhoneQuery phoneQuery : list) {
			System.out.println(phoneQuery.toString());
		}
		int q = s.nextInt();
		List<PhoneQuery> query = new ArrayList<PhoneQuery>();
		for (int i = 0; i <q; i++) {
			String os = s.next();
			int ram = s.nextInt();
			int memory = s.nextInt();
			int budget = s.nextInt();
			for (PhoneQuery phoneQuery : list) {
				
				if(phoneQuery.getOs().equals(os)){
					if(phoneQuery.getRamSize() == ram ){
						if(phoneQuery.getInbuiltMemory() == memory ){
							if(budget>=phoneQuery.getPrice()){
								query.add(phoneQuery);
							}
						}
					}
				
				}
					
			}
			if(query.size()>0)
				System.out.println(query.get(0).getRating());
			else
				System.out.println(-1);
		}
		
		
		
	
		
		s.close();
	}

}
