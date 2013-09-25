/**
 * 
 */
package com.test.polymorphisam;

/**
 * @author Ch.Shani
 *
 */
public class Car implements Vehicle {

	public String getSpeed() {
		System.out.println("Average Car Speed will be 100 KMPH");
		return "100 KMPH";
	}
	
	public String getColor() {
		System.out.println("Car can be of any color.");
		return "Any Color";
	}
	
	public String getMenufecturer() {
		return null;
	}
}
