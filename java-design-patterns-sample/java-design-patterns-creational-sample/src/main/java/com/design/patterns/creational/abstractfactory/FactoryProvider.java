package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.factorymethod.ChocolateFactory;

/**
 * 
 * FactoryProvider.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class FactoryProvider {

	private FactoryProvider() {
		//
	}

	@SuppressWarnings("unchecked")
	public static <T> AbstractFactory<T> getFactory(FactoryType factoryType) {

		AbstractFactory<T> abstractFactory = null;

		if (factoryType == null) {
			throw new IllegalArgumentException("Factory Type : " + factoryType + " Should Not Be Null !");
		}

		switch (factoryType) {
		case CHOCOLATE:
			abstractFactory = (AbstractFactory<T>) new ChocolateFactory();
			break;
		case LOLLIPOP:
			abstractFactory = (AbstractFactory<T>) new LollipopFactory();
			break;
		default:
			throw new UnsupportedOperationException("Factory Type : " + factoryType + "Not Supported");
		}
		return abstractFactory;
	}

}
