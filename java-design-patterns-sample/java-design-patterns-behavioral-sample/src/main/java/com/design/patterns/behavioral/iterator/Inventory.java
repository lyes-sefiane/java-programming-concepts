package com.design.patterns.behavioral.iterator;

/**
 * 
 * Inventory.java
 *
 * @author Lyes Sefiane
 * @param <T>
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public class Inventory implements Iterable<Item> {

	private Item[] items;

	public Inventory(Item... items) {
		this.items = items;
	}

	public Item[] getItems() {
		return items;
	}

	@Override
	public StockIterator iterator() {
		return new StockIterator(this);
	}

}
