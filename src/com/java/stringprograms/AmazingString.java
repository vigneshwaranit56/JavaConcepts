package com.java.stringprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AmazingString {
	/**
	 * no adjacent character are equal!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		int n = s.nextInt();
//		
//		int nums[] = new int[n];
//		
//		
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = s.nextInt();
//		}
//		int m = s.nextInt();
//int maxs[] = new int[m];
//		
//		
//		for (int i = 0; i < maxs.length; i++) {
//			maxs[i] = s.nextInt();
//		}
//
//		String[] strarr = new String[n];
//
//		for (int i = 0; i < n; i++) {
//			strarr[i] = s.next();
//		}
//
//		int []inArr =minimalChange(strarr);
//
////		
////		int[] inArr =subArray(nums, maxs);
//		for (int i = 0; i < inArr.length; i++) {
//
//			System.out.println(inArr[i]);
//		}

		System.out.println(longestSubsequence(s.next()));
		
//		s.close();
		
		
	}
	public static int[] minimalChange(String[] words){

        int[] inArr = new int[words.length];
        for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			int count = 0;

			for (int j = 0; j < ch.length; j++) {
				if (j + 1 == ch.length)
					break;

				if (ch[j] == ch[j + 1]) {

					
						
					
						
						int countCh =frequencyOcuurence(j,ch);
						
						 if( countCh !=0);
						 count+=countCh;					
						
						count++;
				
				}

			}
			inArr[i] = count;

		}
        
        return inArr;
	}
	
	
	private static int frequencyOcuurence(int j, char[] ch) {
		int count =0;

	for (int i = j; i < ch.length; i++) {
		
		for (int k = j+1; k < ch.length; k++) {
			
			if(k == ch.length)
				break;
			
			if(ch[i]==ch[k]);
				count++;
		}
		
		
	}
	
	if(count == 0)
		return 0;
	
	
	
		return count/2;
	}
	public static int[] subArray(int nums[], int maxs[]){
		
		int[] inArr = new int[maxs.length];
		for (int i = 0; i < maxs.length; i++) {
		int count =0;
			for (int j = 0; j < nums.length; j++) {
				System.out.println(nums[j]+" "+maxs[i]);
				if(nums[j] <= maxs[i])
					count++;
					
			}
			System.out.println(count);
			inArr[i] =count;
		}
		
		
		
		return inArr;
		
	}

	
	static int minCost(int g_nodes, int[] g_from, int[] g_to, int[] g_weight) {
		
		
		
		
		
		return g_nodes;

    }
	
	  static int longestSubsequence(String s) {
		  char[] ch=s.toCharArray();
		 
		  
		  
		String val = ch[0]+"";
		
			  
		 for (int i = 1; i < ch.length; i++) {
			
			 
			 			 if(val.charAt(val.length()-1) == ch[i] )
				 val+=ch[i]+"";
			 for (int j = 0; j < ch.length; j++) {
				
			}
				 
		}
		 
		 System.out.println(val);
//		  if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' )
//				val+=c+"";
		  
		  if(val.charAt(0)==val.charAt(val.length()-1))
			  return 0;
		  
		  
		  
		return val.length();

	    }
}
