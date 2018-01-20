package com.java.basicprogram;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
        String str = s.next();
        String rev = "";
        
        for(int i =str.length()-1; i>=0;i--){
            rev=rev+str.charAt(i);
        }
        
        System.out.println(rev);
        
        if(str.equals(rev))
        System.out.println("yes");
        else
        System.out.println("no");
       
       s.close();

	}

	private static void seatNo(int i) {
		
		
	}

}
