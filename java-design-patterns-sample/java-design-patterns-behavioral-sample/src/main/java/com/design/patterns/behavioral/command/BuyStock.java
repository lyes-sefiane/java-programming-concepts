package com.design.patterns.behavioral.command;

/**
 * 
 * BuyStock.java
 * 
 * Acts as Buy Stock Command Processing.
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 27, 2021
 *
 */
public class BuyStock implements Order {

	private Stock stock;

	/**
	 * @param stock
	 */
	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
