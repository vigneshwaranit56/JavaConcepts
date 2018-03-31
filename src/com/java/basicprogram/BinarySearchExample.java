package com.java.basicprogram;

public class BinarySearchExample {
	
	
	public static int binarySearch(int array[],int num){
		int start = 0,end;
		end = array.length-1;
		while (start <= end) {

			int mid = (start + end) / 2;
			if (array[mid] == num) {
				return mid;
			} else if (num < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		
//		int array[] = { 21, 32, 43, 74, 75, 86, 97, 200,108, 149 };
//		int array[] = {7,8,9,6,4,3,2};
//		int num = 8;
//			        
//		System.out.println(binarySearch(array, num));
//	
//		int a[] = {5,6,4,88,73,7,88};
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if(a[i]==a[j] && i != j){
//					System.out.println(a[i]+" this is duplicate and index "+j);
//return;
//				}
//					
//					
//			}
//			
//		}
		String s = "lloeh";
		String s1 = "hello";

		
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
	}
}
