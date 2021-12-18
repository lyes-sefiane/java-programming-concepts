package com.design.patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * CarDecorator.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class SportCarDecorator implements Car {

	private static Logger logger = LoggerFactory.getLogger(SportCarDecorator.class);

	private Car car;

	public SportCarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
		logger.info("Adding features of Sports Car. ");
	}

}
