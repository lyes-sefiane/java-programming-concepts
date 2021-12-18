package com.design.patterns.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * DiscountVisitor.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class DiscountVisitor implements Visitor {

	private static Logger logger = LoggerFactory.getLogger(DiscountVisitor.class);

	@Override
	public void visit(Bread bread) {
		bread.setPrice(0.9);

	}

	@Override
	public void visit(Milk milk) {
		milk.setPrice(1.6);

	}

	@Override
	public void visit(GroceryList groceryList) {
		logger.info("Discount have been applied to your grocery list");
	}

}
