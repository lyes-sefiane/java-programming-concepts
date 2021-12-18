package com.design.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * ChupaChups.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class ChupaChups implements LollipopCandy {

	private static Logger logger = LoggerFactory.getLogger(ChupaChups.class);

	@Override
	public List<LollipopCandy> makeCandyPackage(int quantity) {
		List<LollipopCandy> chupaChupsPackage = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			ChupaChups chupChups = new ChupaChups();
			chupaChupsPackage.add(chupChups);
		}
		logger.info("One package of {} chupa chups has been made!", quantity);
		return chupaChupsPackage;
	}

}
