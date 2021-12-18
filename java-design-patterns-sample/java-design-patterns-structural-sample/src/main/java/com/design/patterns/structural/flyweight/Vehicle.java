package com.design.patterns.structural.flyweight;

/**
 * 
 * Vehicle.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public interface Vehicle {

	public VehicleType getType();

	public void setLocation(int latitude, int longitude);

	public int[] getLocation();

}
