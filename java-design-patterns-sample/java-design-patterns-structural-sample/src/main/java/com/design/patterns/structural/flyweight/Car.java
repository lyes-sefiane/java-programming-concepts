package com.design.patterns.structural.flyweight;

/**
 * 
 * Car.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class Car implements Vehicle {
	
	private int[] location = new int[2];

	@Override
	public VehicleType getType() {
		return VehicleType.CAR;
	}

	@Override
	public void setLocation(int latitude, int longitude) {
		location[0] = latitude;
		location[1] = longitude;

	}

	@Override
	public int[] getLocation() {
		return location;
	}

}
