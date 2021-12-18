package com.design.patterns.structural.bridge;

/**
 * 
 * Shape.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public abstract class Shape {

	protected Color color;

	protected Shape(Color color) {
		this.color = color;
	}

	public abstract String draw();

}
