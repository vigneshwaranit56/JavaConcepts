package com.java.sampleprogram;

import java.util.Scanner;

import com.java.Exception.MyException;

public class TicketReservation {

	final static int seatCount = 13;
	static Passenger[] passengers = new Passenger[seatCount];
	static int top = 0;

	public static boolean isFull() {
		return top == seatCount;
	}

	public static void main(String[] args) throws MyException {

		Scanner s = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("enter 1 for ticket booking ");
			System.out.println("enter 2 for cancellation ");
			System.out.println("enter 3 for print chart ");
			System.out.println("enter 4 for check avialabilty ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter your name");
				String name = s.next();
				System.out.println("enter your age");
				int age = s.nextInt();
				int ticketNo = bookTicket(name, age);

				System.out.println("your seat no" + ticketNo);
				break;
			case 2:
				cancelTicket(s.nextInt());
				System.out.println("your ticket has been canelled");
				break;
			case 3:
				checkAvailability();
				System.out.println();
				break;
			case 4:
				printChart();
				break;
			case 5:
				System.exit(0);
				break;

			default:
				break;
			}
		} while (choice > 0 && choice < 6);

		s.close();

	}

	private static void printChart() {

		for (int i = 1; i <= top; i++) {

			Passenger passenger = passengers[i];
			if (passenger.isIsbooked())
				System.out.println("seat no " + passenger.getTicketNo() + " name " + passenger.getName() + " booked ="
						+ passengers[i].isIsbooked());
		}

	}

	private static void checkAvailability() {

		for (int i = 1; i < seatCount; i++) {
			Passenger passenger = passengers[i];

			if (passenger != null)
				System.out.println("seat no = " + i + " booked = " + (passenger.isIsbooked() ? "yes" : "no"));
			else
				System.out.println("seat no = " + i + " booked = " + "book now!!");

		}

	}

	private static void cancelTicket(int ticketNo) {

		Passenger passenger = new Passenger();
		passenger.setIsbooked(false);
		passengers[ticketNo] = passenger;

	}

	private static int bookTicket(String name, int age) throws MyException {

		if (isFull())
			throw new MyException("all tickets are booked");
		int check = isChceck();

		if (check != -1) {
			Passenger passenger = new Passenger(name, age, check, true);
			passengers[check] = passenger;
			return check;
		}

		++top;

		Passenger passenger = new Passenger(name, age, top, true);

		new TicketReservation();
		passengers[top] = passenger;

		return top;
	}

	private static int isChceck() {

		for (int i = 1; i <= top; i++) {
			Passenger passenger = passengers[i];
			System.out.println(i + " index");
			System.out.println(passenger.isIsbooked());

			if (!passenger.isIsbooked())
				return i;

		}

		return -1;
	}

}
