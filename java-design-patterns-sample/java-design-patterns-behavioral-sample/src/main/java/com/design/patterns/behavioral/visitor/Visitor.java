package com.design.patterns.behavioral.visitor;

/**
 * 
 * Visitor.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public interface Visitor {

	void visit(Bread bread);

	void visit(Milk milk);

	void visit(GroceryList groceryList);

}
