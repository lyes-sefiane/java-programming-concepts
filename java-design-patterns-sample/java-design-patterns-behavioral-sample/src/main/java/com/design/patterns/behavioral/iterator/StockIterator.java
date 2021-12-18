package com.design.patterns.behavioral.iterator;

import java.util.Iterator;

/**
 * 
 * StockIterator.java
 *
 * @author Lyes Sefiane
 * @param <E>
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public class StockIterator implements Iterator<Item> {

	private Inventory inventory;

	private int index;

	public StockIterator(Inventory inventory) {
		this.inventory = inventory;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < inventory.getItems().length;
	}

	@Override
	public Item next() {
		Item[] items = inventory.getItems();
		if (hasNext()) {
			Item item = items[index++];
			if (item.getQuantity() > 0) {
				return item;
			} else {
				return next();
			}
		}
		return null;
	}

	@Override
	public void remove() {
		Iterator.super.remove();
	}

}
