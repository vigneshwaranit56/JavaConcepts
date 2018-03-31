package com.java.basicprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Flowers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i]) + 1);
			else
				map.put(ch[i], 1);

		}

		char count = 'Z';
		int highest = 0;

		for (Map.Entry<Character, Integer> e : map.entrySet()) {

			if (map.get(e.getKey()) > highest) {
				highest = map.get(e.getKey());
				count = e.getKey();
			} else if (e.getKey() < count) {
				count = e.getKey();
			}

		}

		System.out.println(count);
		s.close();

	}

}
