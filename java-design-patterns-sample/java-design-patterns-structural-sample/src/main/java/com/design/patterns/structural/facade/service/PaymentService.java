package com.design.patterns.structural.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * PaymentService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class PaymentService {

	private static Logger logger = LoggerFactory.getLogger(PaymentService.class);

	public boolean makePayement() {
		logger.trace("Payement in progress ...");
		return true;
	}

}
