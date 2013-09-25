/**
 * 
 */
package com.test.polymorphisam;

/**
 * @author Ch.Shani
 *
 */
public class VehicleFactory {

	public static Vehicle getVehicleByName(String className) {
		
		if(className.equalsIgnoreCase("car")) {
			return new Car();
		}else if(className.equalsIgnoreCase("bus")) {
			return new Bus();
		}else if(className.equalsIgnoreCase("ferrari")) {
			return new Ferrari();
		}
		System.out.println(" Invalid Type ");
	return null;	
	}
	
}
