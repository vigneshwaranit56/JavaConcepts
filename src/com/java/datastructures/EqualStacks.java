package com.java.datastructures;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class EqualStacks {
	
	static int findEqualHeight(int[] h1, int[] h2, int[] h3) {
	    int sum1 = sum(h1);
	    int sum2 = sum(h2);
	    int sum3 = sum(h3);

	    int i1 = 0;
	    int i2 = 0;
	    int i3 = 0;

	    while (true) {
	        if (sum1 > sum2 || sum1 > sum3) {
	            sum1 -= h1[i1++];
	        } else if (sum2 > sum1 || sum2 > sum3) {
	            sum2 -= h2[i2++];
	        } else if (sum3 > sum1 || sum3 > sum2) {
	            sum3 -= h3[i3++];
	        } else {
	            break;
	        }
	    }

	    return sum1;
	}
	
	static int sum(int[] arr) {
	    return IntStream.of(arr).sum();
	}

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        int h1[] = new int[n1];
	        for(int h1_i=0; h1_i < n1; h1_i++){
	            h1[h1_i] = in.nextInt();
	        }
	        int h2[] = new int[n2];
	        for(int h2_i=0; h2_i < n2; h2_i++){
	            h2[h2_i] = in.nextInt();
	        }
	        int h3[] = new int[n3];
	        for(int h3_i=0; h3_i < n3; h3_i++){
	            h3[h3_i] = in.nextInt();
	        }
    
   
	       System.out.println( findEqualHeight(h1, h2, h3));
	
	in.close();
	

	}

}
