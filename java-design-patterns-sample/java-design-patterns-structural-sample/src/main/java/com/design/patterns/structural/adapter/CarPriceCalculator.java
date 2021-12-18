package com.design.patterns.structural.adapter;

/**
 * 
 * CarPriceCalculator.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
public class CarPriceCalculator implements PriceCalculator {

	private int age;
	private CarModel model;
	private static final int AVERAGE_PRICE = 6000 ;

	/**
	 * Car Price Calculator
	 * 
	 * @param age
	 * @param model
	 */
	public CarPriceCalculator(int age, CarModel model) {
		super();
		this.age = age;
		this.model = model;
	}

	/**
	 * Get Retail Price
	 * 
	 * @return price
	 */
	public int getRetailPrice() {
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
	 * Calculate Price
	 */
	@Override
	public String calculatePrice() {
	    int price = Math.max(getRetailPrice() - (age * 100), 0);
	    return price + "USD";
	}

}
