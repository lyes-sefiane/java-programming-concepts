package com.design.patterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * 
 * VehicleFactory.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class VehicleFactory {

	private Map<VehicleType, Vehicle> vehicles = new EnumMap<>(VehicleType.class);

	public Vehicle getVehicle(VehicleType vehicleType) {

		if (vehicles.containsKey(vehicleType)) {
			return vehicles.get(vehicleType);
		}

		Vehicle vehicle = null;

		switch (vehicleType) {
		case CAR:
			vehicle = new Car();
			break;
		case TRUCK:
			vehicle = new Truck();
			break;
		default:
			throw new UnsupportedOperationException("Vehicule Type : " + vehicleType + " Not Supported.");
		}
		
		vehicles.put(vehicleType, vehicle);
		
		return vehicle;
	}

}
