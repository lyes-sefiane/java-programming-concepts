package com.design.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * DarkChocolate.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class DarkChocolate implements ChocolateCandy {

	private static Logger logger = LoggerFactory.getLogger(DarkChocolate.class);

	@Override
	public List<ChocolateCandy> makeCandyPackage(int quantity) {
		List<ChocolateCandy> chocolatePackage = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			ChocolateCandy chocolate = new DarkChocolate();
			chocolatePackage.add(chocolate);
		}
		logger.info("One package of {} dark chocolates has been made!", quantity);
		return chocolatePackage;
	}

}
