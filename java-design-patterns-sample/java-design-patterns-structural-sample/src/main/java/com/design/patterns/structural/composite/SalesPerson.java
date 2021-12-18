package com.design.patterns.structural.composite;

/**
 * 
 * SalesPerson.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class SalesPerson implements Payee {

	private String name;

	private Manager manager;

	public SalesPerson(String name, Manager manager) {
		this.name = name;
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public String getName() {
		return name;
	}

	@Override
	public String payExpenses(int amount) {
		return name + " has been paid " + amount + " $";
	}

}
