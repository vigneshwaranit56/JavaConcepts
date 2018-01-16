package com.java.Multithreading;

public class MultithredingWithExtendsThread extends Thread{
	/**
	 * thread is process that can run concurrently with other process
	 * 
	 * process of executing multiple threads simultaneously
	 * 
	 * thread can be implemented  in two ways 
	 *  1) with extending thread
	 *  2) with implementing interface
	 *  
	 *  two or more process run simultaneously a program maximum utilize  cpu time
	 *  
	 *  threads shares common memory space
	 *  
	 *  thread states are
	 *   
	 *  1) new - not yet staarted
	 *  2) runnable -executing in jvm(java virtual machine)
	 *  3) blocked - blocked waiting for monitor lock
	 *  4) waiting - waiting indefinetly for other thread perform action
	 *  5) timed_waiting - waiting for another thread to performaction for specified time
	 *  6) terminated - thread in state
	 * 
	 */
	public void run(){
		System.out.println("thread started");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
MultithredingWithExtendsThread extendsThread = new MultithredingWithExtendsThread();

MultithredingWithExtendsThread.sleep(10000); // it will run after 10s
extendsThread.start(); // thread stared

/**
 *  getName(): It is used for Obtaining a thread’s name
	getPriority(): Obtain a thread’s priority
	isAlive(): Determine if a thread is still running
	join(): Wait for a thread to terminate
	run(): Entry point for the thread
	sleep(): suspend a thread for a period of time
	start(): start a thread by calling its run() method
 */
	}

}
