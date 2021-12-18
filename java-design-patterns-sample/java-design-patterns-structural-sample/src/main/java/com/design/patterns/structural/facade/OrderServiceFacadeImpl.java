package com.design.patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.design.patterns.structural.facade.domain.Product;
import com.design.patterns.structural.facade.service.InventoryService;
import com.design.patterns.structural.facade.service.PaymentService;
import com.design.patterns.structural.facade.service.ShippingService;

/**
 * 
 * OrderServiceFacadeImpl.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 21, 2021
 *
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade {

	private static Logger logger = LoggerFactory.getLogger(OrderServiceFacadeImpl.class);

	@Override
	public boolean placeOrder(Product product) {

		boolean orderFulfilled = false;

		InventoryService inventoryService = new InventoryService();

		if (inventoryService.isAvailable(product)) {
			logger.info("Product Id {} is Available.", product.getId());
			PaymentService paymentService = new PaymentService();
			if (paymentService.makePayement()) {
				logger.info("Product Id {} Payment Completed.", product.getId());
				ShippingService shippingService = new ShippingService();
				shippingService.shipProduct(product);
				orderFulfilled = true;
			}
		}
		return orderFulfilled;
	}

}
