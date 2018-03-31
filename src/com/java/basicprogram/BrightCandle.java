package com.java.basicprogram;

import java.util.Scanner;

public class BrightCandle {
/**
 * Pranav goes to a shop to buy candles. The shopkeeper shows him candles of different brightness level. As Pranav hates light, he wants to buy a candle with the minimum brightness. But his wife instructed him not to do so. 
Now Pranav has to buy a candle which is just brighter than the minimum one. Can you help him in choosing the right candle.
 * @param args
 */
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // no of candles
		
		int brightness[] = new int[n];
		
		for (int i = 0; i < brightness.length; i++) 
			brightness[i] = s.nextInt();
		
		int first,second;
		first =second = Integer.MAX_VALUE;
		
		for (int i = 1; i < brightness.length; i++) {
			
			 /* If current element is smaller than first
            then update both first and second */
          if (brightness[i] < first)
          {
              second = first;
              first = brightness[i];
          }

          /* If arr[i] is in between first and second
             then update second  */
          else if (brightness[i] < second && brightness[i] != first)
              second = brightness[i];
		}
		
		 if (second == Integer.MAX_VALUE)
	            System.out.println("There is no second" +
	                               "smallest element");
	        else
	            System.out.println(second);
		
		s.close();

	}

}
