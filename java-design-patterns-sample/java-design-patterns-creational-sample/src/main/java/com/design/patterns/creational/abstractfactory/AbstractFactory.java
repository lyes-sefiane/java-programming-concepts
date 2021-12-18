package com.design.patterns.creational.abstractfactory;

import java.util.List;

import com.design.patterns.creational.factorymethod.CandyType;

/**
 * 
 * AbstractFactory.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public interface AbstractFactory<T> {

	T getCandy(CandyType candyType);

	List<T> getCandyPackage(int quantity, CandyType candyType);
}
