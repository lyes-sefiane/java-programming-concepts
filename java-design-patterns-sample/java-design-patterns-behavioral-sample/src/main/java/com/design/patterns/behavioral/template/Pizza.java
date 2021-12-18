package com.design.patterns.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Pizza.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public abstract class Pizza {

	protected static Logger logger = LoggerFactory.getLogger(Pizza.class);

	public void makeBase() {
		logger.info("Mix flour, yeast and salt");
		logger.info("Roll out the dough");
	}

	public void addToppings() {
		logger.info("Add tomato");
		logger.info("Add cheese");
	}

	abstract void cook();

	public void printInsdtructions() {
		makeBase();
		addToppings();
		cook();
	}

}
