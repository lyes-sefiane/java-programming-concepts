package com.design.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * DumDum.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class DumDum implements LollipopCandy {

	private static Logger logger = LoggerFactory.getLogger(DumDum.class);

	@Override
	public List<LollipopCandy> makeCandyPackage(int quantity) {
		List<LollipopCandy> chupaChupsPackage = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			DumDum dumDum = new DumDum();
			chupaChupsPackage.add(dumDum);
		}
		logger.info("One package of {} dum dum has been made!", quantity);
		return chupaChupsPackage;
	}

}
