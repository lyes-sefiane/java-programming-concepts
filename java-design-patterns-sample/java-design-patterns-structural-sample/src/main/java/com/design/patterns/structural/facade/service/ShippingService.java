package com.design.patterns.structural.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.design.patterns.structural.facade.domain.Product;

/**
 * 
 * ShippingService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class ShippingService {

	private static Logger logger = LoggerFactory.getLogger(ShippingService.class);

	public boolean shipProduct(Product product) {
		logger.info("Shippment Product Id {} in Progress ...", product.getId());
		return true;
	}
}
