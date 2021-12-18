package com.design.patterns.behavioral.command;

/**
 * 
 * SellStock.java
 * 
 * Acts as Sell Stock Command Processing.
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 27, 2021
 *
 */
public class SellStock implements Order {

	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}

}
