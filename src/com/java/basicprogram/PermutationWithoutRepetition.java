package com.java.basicprogram;

public class PermutationWithoutRepetition {
	  
	 public static void main(String[] args) {
	  permutation("sumit");
	 }
	  
	 private static void permutation(String string) {
	  printPermutation(string,"");
	 }
	 
	 private static void printPermutation(String string, String permutation) {
	   
	  if(string.length()==0){
	   System.out.println(permutation);
	   return;
	  }
	   
	  for (int i = 0; i < string.length(); i++) {
	   char toAppendToPermutation = string.charAt(i);
	   String remaining = string.substring(0, i) + string.substring(i + 1);
	    System.out.println("remaining "+remaining);
	   printPermutation( remaining,  permutation + toAppendToPermutation);
	  }  
	 }
	 
	}
