package com.design.patterns.creational.factorymethod;

import java.util.List;

/**
 * 
 * Candy.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public interface ChocolateCandy {

	abstract List<ChocolateCandy> makeCandyPackage(int quantity);

}
