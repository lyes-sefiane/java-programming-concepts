package com.design.patterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Stock.java
 * 
 * Acts as a request.
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 27, 2021
 *
 */
public class Stock {

	private static Logger logger = LoggerFactory.getLogger(Stock.class);

	private final String name;
	private final int quantity;

	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void buy() {
		logger.info("Stock Name : {}, Quantity : {} bought.", name, quantity);
	}

	public void sell() {
		logger.info("Stock Name : {}, Quantity : {} sold.", name, quantity);
	}

}
