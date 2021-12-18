package com.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * GroceryList.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class GroceryList implements Groceries {

	List<Groceries> groceries = new ArrayList<>();

	public GroceryList() {
		Bread bread = new Bread();
		Bread bread2 = new Bread();
		Milk milk = new Milk();
		groceries.addAll(Arrays.asList(bread, bread2, milk));

	}

	@Override
	public double getPrice() {
		return groceries.stream().mapToDouble(Groceries::getPrice).sum();
	}

	@Override
	public void accept(Visitor visitor) {
		groceries.forEach(g -> g.accept(visitor));
		visitor.visit(this);
	}

}
