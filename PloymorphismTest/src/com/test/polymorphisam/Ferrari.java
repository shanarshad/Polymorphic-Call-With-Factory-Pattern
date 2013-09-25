/**
 * 
 */
package com.test.polymorphisam;

/**
 * @author Ch.Shani
 *
 */
public class Ferrari extends Car {

	public String getSpeed() {
		System.out.println("Maximum Speed of Ferrari is 250 KMPH");
		return "250 KMPH";
	}
	
	public String getColor() {
		System.out.println("Color of Ferrari is RED");
		return "RED";
	}
	
	public String getMenufecturer() {
		System.out.println("Ferrari");
		return null;
	}
	
}
