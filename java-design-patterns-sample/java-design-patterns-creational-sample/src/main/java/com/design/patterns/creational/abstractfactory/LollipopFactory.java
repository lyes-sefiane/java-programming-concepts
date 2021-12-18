package com.design.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.design.patterns.creational.factorymethod.CandyType;

/**
 * 
 * LollipopFactory.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class LollipopFactory implements AbstractFactory<LollipopCandy> {

	private static Logger logger = LoggerFactory.getLogger(LollipopFactory.class);

	@Override
	public LollipopCandy getCandy(CandyType candyType) {

		LollipopCandy candy = null;

		if (candyType == null) {
			throw new IllegalArgumentException("Candy Type : " + candyType + " Should Not Be Null !");
		}

		switch (candyType) {
		case LOLLIPOP_CHUPA_CHUPS:
			candy = new ChupaChups();
			break;
		case LOLLIPOP_DUM_DUM:
			candy = new DumDum();
			break;
		default:
			throw new UnsupportedOperationException(
					"Candy Type : " + candyType + "Not Yet Supported in Lollipop Factory");
		}
		return candy;
	}

	@Override
	public List<LollipopCandy> getCandyPackage(int quantity, CandyType candyType) {
		LollipopCandy candy = null;
		List<LollipopCandy> candyPackage = new ArrayList<>();
		try {
			candy = getCandy(candyType);
			candyPackage = candy.makeCandyPackage(quantity);
		} catch (RuntimeException e) {
			logger.info("Exception Occurs While Getting Candy Package. {}", e.getMessage());
		}
		return candyPackage;
	}

}
