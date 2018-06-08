package com.java8;

@FunctionalInterface
public interface FNExample {
	 // one abstract method
	 void decorateWithCurtains();

	 
	 // default method
	 default void decorateWithPaints()
	 {
	  System.out.println("Decorating using paints");
	 }
	 
	 default void decorateWithCurtain()
	 {
	  System.out.println("Decorating using paints");
	 }
	 // Overriding method of java.lang.Object
	 @Override
	 public int hashCode();

}
