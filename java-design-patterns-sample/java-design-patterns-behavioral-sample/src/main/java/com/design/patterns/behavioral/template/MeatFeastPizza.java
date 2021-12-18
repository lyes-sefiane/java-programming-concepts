package com.design.patterns.behavioral.template;

/**
 * 
 * MeatFeastPizza.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class MeatFeastPizza extends Pizza {

	@Override
	public void addToppings() {
		super.addToppings();
		logger.info("Add pepperoni");
		logger.info("Add ham");
		logger.info("Add chicken");
	}

	@Override
	void cook() {
		logger.info("Cook in the oven for 20 min");
	}

}
