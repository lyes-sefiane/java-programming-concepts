package com.design.patterns.behavioral.template;

/**
 * 
 * VegetarianPizza.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class VegetarianPizza extends Pizza {

	@Override
	public void addToppings() {
		super.addToppings();
		logger.info("Add peppers");
		logger.info("Add olives");
	}

	@Override
	void cook() {
		logger.info("Cook in the oven for 15 min");
	}

}
