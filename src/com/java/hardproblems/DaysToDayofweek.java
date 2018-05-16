package com.java.hardproblems;

import java.util.Scanner;

public class DaysToDayofweek {

	public class Node{
		Node prev;
		int data;
		Node next;
		
		public Node() {
			
	
			
		}
	}
	public static void main(String[] args) {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

*/
        //Scanner
        Scanner s = new Scanner(System.in);
        Integer test = s.nextInt();        
        Integer size = s.nextInt();  
        int[] arr = new int[size];
        
        for(int i =0; i<arr.length; i++)
            arr[i] = s.nextInt(); 
            
            if(test ==0)
            return;
            
            
            
        for(int i =1; i<=test; i++){
            kelement(size,arr);
        }    
        
        
        
        


    }

	private static void kelement(Integer size, int[] arr) {
		int max = 0;
		for (int i = 1; i <= size; i++) {
			int sum = 0;
			for (int j = 0; j < size; j++) {
				if (arr[j] >= i)
					sum += i;
				else {
					sum += arr[j] * -1;

				}

			}

			max = sum >= max ? sum : max;

		}

		System.out.println(max);
	}

}
