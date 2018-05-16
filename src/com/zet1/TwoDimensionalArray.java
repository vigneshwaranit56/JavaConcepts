package com.zet1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoDimensionalArray {
	/**
	 * Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and
	 * search for substring like “too” in the two dimensional string both from
	 * left to right and from top to bottom.
	 * 
	 * w e L C O M E T O Z O H O C O R P O R A T I O n
	 * 
	 * And print the start and ending index as
	 * 
	 * Start index : <1,2>
	 * 
	 * End index: <3, 2>
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str=str.toLowerCase();
//		String result = s.nextLine();

		char[][] ch = new char[5][5];
		int k = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (str.length() == k)
					break;
				ch[i][j] = str.charAt(k++);
			}

		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
		                 {
		                 //check for left to right existence 
		                 if((ch[i][j]=='t')&&(ch[i][j+1]=='o')&&(ch[i][j+2]=='o'))
		      {
		      System.out.println("it starts  <"+i+","+j+">");
		      System.out.println();
		      System.out.println("it ends <"+i+","+(j+2)+">");
		      break;
		      }
		   		      System.out.println();
		                    //check for top to bottom existence
		      if((ch[i][j]=='t')&&(ch[i+1][j]=='o')&&(ch[i+2][j]=='o'))
		      {
			      System.out.println("it starts at %d,%d"+i+","+j);
			      System.out.println();
			      System.out.println("it ends at %d,%d"+(i+2)+","+j);
			      break;
		      }
		      }
		    }
		


		}
}
}
