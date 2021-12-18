package com.design.patterns.structural.adapter;

/**
 * 
 * TruckPriceCalculator.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
public class TruckPriceCalculator implements PriceCalculator {

	private int age;
	private int mileage;
	private static final int AVERAGE_PRICE = 6000;

	/**
	 * Truck Price Calculator
	 * 
	 * @param age
	 * @param mileage
	 */
	public TruckPriceCalculator(int age, int mileage) {
		this.age = age;
		this.mileage = mileage;
	}

	/**
	 * Calculate Price
	 */
	@Override
	public String calculatePrice() {
		int price = Math.max(AVERAGE_PRICE - age * 100 - mileage / 100, 0);
		return price + "USD";
	}

}
