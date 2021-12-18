package com.design.patterns.structural.adapter.lib;

import com.design.patterns.structural.adapter.CarModel;

/**
 * 
 * UKCarPriceCalculator.java
 * 
 * External Jar File Simulation
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
public class UKCarPriceCalculator {

	private int age;
	private CarModel model;
	private static final int AVERAGE_PRICE = 9000;

	/**
	 * Car Price Calculator
	 * 
	 * @param age
	 * @param model
	 */
	public UKCarPriceCalculator(int age, CarModel model) {
		this.age = age;
		this.model = model;
	}

	/**
	 * Get Retail Price
	 * 
	 * @return price
	 */
	private int getRetailPrice() {
		switch (model) {
		case FORD:
			return 3000;
		case AUDI:
			return 5000;
		case BMW:
			return 7000;
		case TESLA:
			return 10000;
		default:
			return AVERAGE_PRICE;
		}
	}

	/**
	 * Get Price
	 */
	public int getPrice() {
		return Math.max(getRetailPrice() - (age * 100), 0);
	}

}
