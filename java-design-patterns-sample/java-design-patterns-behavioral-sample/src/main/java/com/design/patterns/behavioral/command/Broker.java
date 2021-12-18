package com.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Broker.java
 * 
 * 
 * Acts as an invoker object.
 * 
 * It can take and place orders
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 27, 2021
 *
 */
public class Broker {

	private List<Order> orders = new ArrayList<>();

	/**
	 * Take Order
	 * 
	 * @param order
	 */
	public void takeOrder(Order order) {
		orders.add(order);
	}

	/**
	 * Place Order(s)
	 */
	public void placeOrder() {
		for (Order order : orders) {
			order.execute();
		}

		orders.clear();
	}

}
