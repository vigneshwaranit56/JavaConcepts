package com.java.basicprogram;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String txt = s.next();
	
	digiCount(txt);
	
	s.close();
	}

	private static void digiCount(String txt) {
		int a0 = 0,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
		
		for (int i = 0; i < txt.length(); i++) {
			char ch= txt.charAt(i);
			switch(ch){
			
			case '0':
				a0++;
				break;
			case '1':
				a1++;
				break;
			case '2':
				a2++;
				break;
			case '3':
				a3++;
				break;
			case '4':
				a4++;
				break;
			case '5':
				a5++;
				break;
			case '6':
				a6++;
				break;
			case '7':
				a7++;
				break;
			case '8':
				a8++;
				break;
			case '9':
				a9++;
				break;
				
				
			}
			
		}
		
		System.out.println("0 "+a0);
		System.out.println("1 "+a1);
		System.out.println("2 "+a2);
		System.out.println("3 "+a3);
		System.out.println("4 "+a4);
		System.out.println("5 "+a5);
		System.out.println("6 "+a6);
		System.out.println("7 "+a7);
		System.out.println("8 "+a8);
		System.out.println("9 "+a9);
		
		
	}

}
