package com.design.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.design.patterns.creational.abstractfactory.AbstractFactory;

/**
 * 
 * ChocolateFactory.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class ChocolateFactory implements AbstractFactory<ChocolateCandy>{

	private static Logger logger = LoggerFactory.getLogger(ChocolateFactory.class);

	/**
	 * Get Candy
	 * 
	 * @param chocolateType
	 * @return created Candy
	 */
	public ChocolateCandy getCandy(CandyType candyType) {

		ChocolateCandy candy = null;

		if (candyType == null) {
			throw new IllegalArgumentException("Candy Type : " + candyType + " Should Not Be Null !");
		}

		switch (candyType) {
		case CHOCOLATE_DARK:
			candy = new DarkChocolate();
			break;
		case CHOCOLATE_MILK:
			candy = new WhiteChocolate();
			break;
		case CHOCOLATE_WHITE:
			candy = new MilkChocolate();
			break;
		default:
			throw new UnsupportedOperationException("Candy Type : " + candyType + " Not Yet Supported in Chocolate Factory");
		}
		return candy;
	}
	
	/**
	 * Get Candy Package
	 * 
	 * @param quantity
	 * @param chocolateType
	 * @return List<Candy>
	 */
	@Override
	public List<ChocolateCandy> getCandyPackage(int quantity, CandyType candyType) {
		ChocolateCandy candy = null;
		List<ChocolateCandy> candyPackage = new ArrayList<>();
		try {
			candy = getCandy(candyType);
			candyPackage = candy.makeCandyPackage(quantity);
		} catch (RuntimeException e) {
			logger.info("Exception Occurs While Getting Candy Package. {}", e.getMessage());
		}
		return candyPackage;
	}
}
