package com.java.Multithreading;

public class RunningThreadExample {

	public static void main(String[] args) {
		
		ThreadExampleWithExtend cnt = new ThreadExampleWithExtend();
		 try
	      {
	         while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	      
	      
	}

}
