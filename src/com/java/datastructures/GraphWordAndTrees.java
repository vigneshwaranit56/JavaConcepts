package com.java.datastructures;

import java.util.Scanner;

public class GraphWordAndTrees {

	 private static int[][] inarr ;

		public static void main(String[] args) throws Exception {
			 Scanner s = new Scanner(System.in);
			 int n = s.nextInt()+1;
			 int m = s.nextInt();
		   
			
			char[] ch = new char[n];
			for (int i = 1; i < ch.length; i++) {
				ch[i] = s.next().charAt(0);
			}
			
			inarr = new int[n][n];
			 for (int i = 1; i < n-1; i++) {
				
				 int u = s.nextInt();
				 int v = s.nextInt();
			    inarr[u][v]=ch[u];
//				 inarr[v][u]=ch[u];
				
			}
		        for (int i = 0; i <= m; i++) {
					int q = s.nextInt();
					String qstr = s.next();
					int count = matchCharacter(q,qstr);
					System.out.println(count);
					
				}
		        
		        s.close();

		}

		private static int matchCharacter(int q, String qstr) {
		int count = 0;
			for (int i = 1; i < inarr.length; i++) {
				char ch = (char) inarr[q][i];

				
				if (qstr.contains(ch + ""))
					count++;

			}
			
			
			
			
			return qstr.length()-count;
		}

}
