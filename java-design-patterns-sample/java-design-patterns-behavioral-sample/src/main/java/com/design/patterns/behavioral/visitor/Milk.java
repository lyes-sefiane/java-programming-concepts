package com.design.patterns.behavioral.visitor;

/**
 * 
 * Milk.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class Milk implements Groceries {

	private double price = 2;

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
