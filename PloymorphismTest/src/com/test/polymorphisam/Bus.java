/**
 * 
 */
package com.test.polymorphisam;

/**
 * @author Ch.Shani
 *
 */
public class Bus implements Vehicle {
	
	@Override
	public String getSpeed() {
		System.out.println("Average Speed of a bus is 80 KMPH");
		return "80 KMPH";
	}
	
	@Override
	public String getColor() {
		return "Bus is Multi Color";
	}
}
