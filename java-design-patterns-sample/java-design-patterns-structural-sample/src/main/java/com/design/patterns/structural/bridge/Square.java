package com.design.patterns.structural.bridge;

/**
 * 
 * Square.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Square drawn. " + color.fill();
	}

}
