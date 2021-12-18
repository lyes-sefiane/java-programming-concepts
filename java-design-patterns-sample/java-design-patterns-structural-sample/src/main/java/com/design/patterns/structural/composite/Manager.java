package com.design.patterns.structural.composite;

/**
 * 
 * Manager.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class Manager implements Payee {

	private String name;

	public Manager(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String payExpenses(int amount) {
		return name + " has been paid " + amount + " $";
	}

}
