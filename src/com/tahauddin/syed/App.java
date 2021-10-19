package com.tahauddin.syed;

public class App {

	public static void main(String[] args) {
		
		/**
		 * Creating Object for User Define Thread Class
		 */
		MultiThreadedExample threadedExample = new MultiThreadedExample();
		
		/**
		 * Passing Runnable Object to Thread Class Object
		 */
		Thread thread1 = new Thread(threadedExample);
		Thread thread2 = new Thread(threadedExample);
		Thread thread3 = new Thread(threadedExample);

		
		/**
		 * starting all the 3 threads. these 3 threads will call run methon from user define 
		 * thread class and in run() is responsible to create the singleton object.
		 * hence it is better to have synchronized block in singleton class.
		 */
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
