package com.design.patterns.behavioral.visitor;

/**
 * 
 * Groceries.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public interface Groceries {

	public double getPrice();

	public void accept(Visitor visitor);

}
