package com.tahauddin.syed;
/**
 * 
 * @author Syed Tahauddin
 *
 */
public class Employee {
	
	private Employee() {
		System.out.println("Object Created Successfully");
	}
	
	/**
	 * Lazy Instantization 
	 */
	private static Employee INSTANCE;

	
	/**
	 * instead of making entire method as synchronized we make only the logic to create
	 * the object as synchronized by having a synchronized block
	 * 
	 * @return Employee Object
	 */
	public static Employee getInstance() {
		
		synchronized (Employee.class) {  
			
			if(INSTANCE == null) {
				INSTANCE = new Employee();
			}
		}
		return INSTANCE;
	}
}
