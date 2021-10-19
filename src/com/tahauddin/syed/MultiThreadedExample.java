package com.tahauddin.syed;

public class MultiThreadedExample implements Runnable {
	
	/**
	 * creating the object for singleton class in run()
	 * then singleton pattern will not work. to have singleton class 
	 * in multithreaded environment then its better to have a synchronized block 
	 * or synchronized method.
	 *
	 */
	@Override
	public void run() {
		Employee employee = Employee.getInstance();
		System.out.println(employee.hashCode());
	}

}
