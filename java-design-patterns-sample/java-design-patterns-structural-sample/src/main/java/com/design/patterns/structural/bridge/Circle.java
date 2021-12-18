package com.design.patterns.structural.bridge;

/**
 * 
 * Circle.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Circle drawn. " + color.fill();
	}

}
