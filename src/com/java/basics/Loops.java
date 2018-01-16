package com.java.basics;

public class Loops {
	
	public void ifLoop(){
		int num1 = 10;
		int num2 = 20;
		
		/*
		 *  if(condition)
		 */
		
		if(num1 < num2)
			System.out.println(num1+"smallest number");
		
		/*
		 *  if(condition)
		 *  
		 *   else
		 */
		if(num1 < num2)
			System.out.println(num1+"smallest number");
		else
			System.out.println(num2+"smallest number");
		
		/*
		 * nested if
		 * if(condition){
		 * 
		 * if(condition){
		 * 
		 * }
		 * 
		 * }
		 */
		
		if(num1<num2){
			
			if(num2<50){
				System.out.println(num2+"is lesser than 50");
			}
				
		}
		
		/*
		 * if (condition)
		 * else if(condition)
		 * else
		 * 
		 */
		
		int num3 = 5678;
		if(num3 <100 && num3>=1) {
			  System.out.println("Its a two digit number");
			}
			else if(num3 <1000 && num3>=100) {
			  System.out.println("Its a three digit number");
			}
			else if(num3 <10000 && num3>=1000) {
			  System.out.println("Its a four digit number");
			}
			else if(num3 <100000 && num3>=10000) {
			  System.out.println("Its a five digit number");			
			}
			else {
			  System.out.println("number is not between 1 & 99999");			
			}
	}
	
	/**
	 * for(initialization; condition ; increment/decrement)
		{
   		statement(s);
		}	
	 */
	public void forLoop(){
		// initialization variable initialization int i =0;
		// condition defined as it has run for certain condition alone i < 5
		// increment/decrement is ++i,i++,--i,i++
		
		for (int i = 10; i > 0; i--) {
			  System.out.println("The value of i is: "+i);
		}
		/**
		 *  The value of i is: 10
			The value of i is: 9
			The value of i is: 8
			The value of i is: 7
			The value of i is: 6
			The value of i is: 5
			The value of i is: 4
			The value of i is: 3
		    The value of i is: 2
		    The value of i is: 1
		    
		    nt i=0 is initialization expression
			i>0 is condition(Boolean expression)
			i–- Decrement operation	
		 */
		
		 int arr[]={2,11,45,9};
         //i starts with 0 as array index starts with 0 too
         for(int i=0; i<arr.length; i++){
              System.out.println(arr[i]);
         }
         
         
		/**
		 * for each or enchanced for loop
		 */
		
         int a[] = {2,11,45,9,56};
         
         for (int i : a) {
			System.out.println("i at index = "+i+" value ="+a[i]);
		}
         
	}
	/**
	 * switch (variable or an integer expression)
	{
     case constant:
     //Java code
     ;
     case constant:
     //Java code
     ;
     default:
     //Java code
     ;
	}
	 */

	public void switchCase(){
		
		int num = 1;
		
		switch(num+3){
		
		case 1:
			System.out.println("value is"+num);
			break;
		case 2:
			System.out.println("value is"+num);
			break;
		case 3:
			System.out.println("value is"+num);
			break;
		default:
			System.out.println("default value is"+num);
		
		
		}
		
		/**
		 * if don't use break statement it will go to all case statements
		 */
		
	}
	
	/**
	 * while(condition)
		{
   		statement(s);
		}
	 */
	public void whileLoop(){
		
		int i = 5;
		while(i<10){
			System.out.println("index of value"+i);
			i++;
			
		}
		
		/**
		 * iterating over array
		 */
		
		int a[] = {5,7,8,9,12,56};
		
		int j=0;
		
		while(j<6){
			System.out.println("index of j"+j+" value is"+a[j]);
			j++;// incrementing
		}
	}
	
	/**
	 * do
	{
   		statement(s);
	} while(condition);
	 */
	public void doWhileLoop(){
		/*
		 * first do operations and  then check the condition
		 */
		
		 int arr[]={2,11,45,9};
         //i starts with 0 as array index starts with 0
         int i=0;
         do{
              System.out.println(arr[i]);
              i++;
         }while(i<4);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
