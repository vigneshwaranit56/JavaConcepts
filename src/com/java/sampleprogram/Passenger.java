package com.java.sampleprogram;

public class Passenger {

	private String name;
	private int age;
	private int ticketNo;
	private boolean booked = false;
	
	public Passenger(String name, int age, int top,boolean booked) {
		this.name = name;
		this.age = age;
		this.ticketNo = top;
		this.booked = booked;
	}

	public Passenger() {	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public boolean isIsbooked() {
		return booked;
	}

	public void setIsbooked(boolean isbooked) {
		this.booked = isbooked;
	}

	

}
