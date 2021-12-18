package com.design.patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * BasicCar.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class BasicCar implements Car {

	private static Logger logger = LoggerFactory.getLogger(BasicCar.class);

	@Override
	public void assemble() {
		logger.info("Basic Car.");
	}

}
