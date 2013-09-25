/**
 * 
 */
package com.test.polymorphisam;

/**
 * @author Ch.Shani
 *
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle ferrari = VehicleFactory.getVehicleByName("ferrari");
		ferrari.getSpeed();
		ferrari.getColor();
		
		Vehicle car = VehicleFactory.getVehicleByName("car");
		car.getSpeed();
		
		Vehicle bus = VehicleFactory.getVehicleByName("bus");
		bus.getSpeed();

	}

}
