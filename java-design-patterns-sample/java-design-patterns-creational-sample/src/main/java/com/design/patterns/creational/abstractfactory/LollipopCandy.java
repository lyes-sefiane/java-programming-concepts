package com.design.patterns.creational.abstractfactory;

import java.util.List;

/**
 * 
 * LollipopCandy.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public interface LollipopCandy {

	abstract List<LollipopCandy> makeCandyPackage(int quantity);

}
