package com.java.hardproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenPalindromicNumber {

		static String evenlength(String n)
		{
		
			String res = n;

			for (int j = n.length() - 1; j >= 0; --j)
				res += n.charAt(j);

			return res;
		}

		public static void main(String[] args)
		{Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			String str = s.nextLine();
			str = evenlength(str);
			System.out.println(str);
		
				
			
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for (int j = 0; j < str.length(); j++) {
				Integer in = Integer.parseInt(str.charAt(j) + "");
				if (map.containsKey(in))
					map.put(in, map.get(in) + 1);
				else
					map.put(in, 1);
			}
			
			
			if(map.size()>0){
				int min = 10;


			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				
				if(map.size() ==1){
					min = entry.getKey();
				}
				
				if(entry.getKey()<min)
					min = entry.getKey();
			}
			
			System.out.println(min);

			}
			

		}
			
		}

}
