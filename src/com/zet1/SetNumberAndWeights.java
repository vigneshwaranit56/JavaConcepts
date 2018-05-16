package com.zet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SetNumberAndWeights {
/**
 *  Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order.
 * @param args
 */
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
double[] elements = new double[n];

for (int i = 0; i < n; i++) {
	elements[i] = s.nextInt();
}
s.close();

Map<Double,Double> map = new HashMap<Double,Double>();

		for (int i = 0; i < elements.length; i++) {

			double element = elements[i];
			double sqrt = Math.sqrt(element);

			map.put(element, 0.0);

			if (element % sqrt == 0)
				map.put(element, map.get(element) + 5);
			if (element % 4 == 0 || element % 6 == 0)
				map.put(element, map.get(element) + 4);
			if (element % 2 == 0)
				map.put(element, map.get(element) + 3);

		}

		Set<Entry<Double,Double>> set = map.entrySet();
		
		List<Entry<Double,Double>> list = new ArrayList<Entry<Double,Double>>(set);
		
		Comparator<Entry<Double,Double>> comp  = new Comparator<Map.Entry<Double,Double>>() {
			
			@Override
			public int compare(Entry<Double, Double> o1, Entry<Double, Double> o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getValue()-o2.getValue());
			}
		};
		
		Collections.sort(list, comp);
		System.out.println(list);
		
	}

}
