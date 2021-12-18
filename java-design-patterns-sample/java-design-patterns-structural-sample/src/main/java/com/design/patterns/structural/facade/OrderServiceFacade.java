package com.design.patterns.structural.facade;

import com.design.patterns.structural.facade.domain.Product;

/**
 * 
 * OrderServiceFacade.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public interface OrderServiceFacade {

	public boolean placeOrder(Product product);

}
