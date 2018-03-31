package com.java.oops;


public class Enumeration {
	
	public enum Value{
	
		Constant(3);
		
		public final int h1;
		
		Value(int h1){
			this.h1 =h1;
		}
		
		public int getLevelCode() {
	        return this.h1;
	    }
		
		public final int methodMul(){
			return h1*h1;
					
		}
	
	
	}
	
public static void main(String[] args) {
	
	
	for (Value string : Value.values()) {
		
		System.out.println(string);
	}
	
Value val = Value.Constant;



	System.out.println(val.getLevelCode());
	
	System.out.println(val.methodMul());
	
	
}

}
