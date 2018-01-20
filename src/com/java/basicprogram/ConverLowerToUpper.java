package com.java.basicprogram;

import java.util.Scanner;

import com.java.Exception.MyException;

public class ConverLowerToUpper {
	
	public String convertCase(String str){
		
		String ret ="";
		
		for (int i = 0; i < str.length(); i++) {

			int n = str.charAt(i);
			char ch = 0;
			
			if (n >= 'a')
				n = n - 32;

			else if (n < 'a' && n > 'A')
				n = n + 32;

			ch = (char) n;
			ret += ch + "";

		}
		return ret;
	}

	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		
//		String str =s.nextLine();
//		
//		ConverLowerToUpper ret = new ConverLowerToUpper();
//		str = ret.convertCase(str);
//		
//		
//		
//		
//		System.out.println(str);
//		
//		s.close();
		
		int ascii =67;
		String ret = "";
		if(('!'>ascii && ascii<'@')||!('['>ascii && ascii<'`')||(!('{'>ascii&&ascii<'~'))){
			ret=ret+"C";
			
		}
		
		System.out.println(ret);
		

	}

}
