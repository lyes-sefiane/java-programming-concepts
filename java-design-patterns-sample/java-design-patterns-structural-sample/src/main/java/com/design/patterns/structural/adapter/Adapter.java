package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.lib.UKCarPriceCalculator;

/**
 * 
 * Adapter.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
public class Adapter implements PriceCalculator {

	private UKCarPriceCalculator ukCarPriceCalculator;

	public Adapter(UKCarPriceCalculator ukCarPriceCalculator) {
		this.ukCarPriceCalculator = ukCarPriceCalculator;
	}

	@Override
	public String calculatePrice() {
		return ukCarPriceCalculator.getPrice() + "BGP";
	}

}
