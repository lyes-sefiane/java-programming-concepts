package com.design.patterns.structural.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.design.patterns.structural.facade.domain.Product;

/**
 * 
 * InventoryService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class InventoryService {

	private static Logger logger = LoggerFactory.getLogger(InventoryService.class);

	public boolean isAvailable(Product product) {
		logger.info("Checking Product Id {} Availability ...", product.getId());
		return true;
	}

}
