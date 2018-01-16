package com.java.Multithreading;

public class MultiThreadingWithImplementsRunnable implements Runnable {
	/**
	 *  this example run with Runnable implements
	 *  
	 *  Thread priority
	 *  
	 *  Thread priority decides when to switch from one running thread to another,
	 *   process is called context switching
	 *   
	 *   A thread can voluntarily release control and the highest priority thread 
	 *   that is ready to run is given the CPU.
	 *   
	 *   we can use MIN_PRIORITY, NORM_PRIORITY or MAX_PRIORITY.
	 *  */
	
	 /**  Synchronization
	 *   
	 *   Multithreading introduces asynchronous behavior to the programs. 
	 *   If a thread is writing some data another thread may be reading the same data at that time. This may bring inconsistency.
	 *   
	 *   When two or more threads need access to a shared resource 
	 *   there should be some way that the resource will be used only by one resource at a time.
		 The process to achieve this is called synchronization.
	   
	 */
	Thread mythread ;
	public MultiThreadingWithImplementsRunnable() {
		 mythread = new Thread(this, "my runnable thread");
	      System.out.println("my thread created" + mythread);
	      mythread.start();
		
	}
	
	public void run() {
		try
	      {
	        for (int i=0 ;i<10;i++)
	        {
	          System.out.println("Printing the count " + i);
	          Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("mythread run is over" );
	   }
	


	
}
