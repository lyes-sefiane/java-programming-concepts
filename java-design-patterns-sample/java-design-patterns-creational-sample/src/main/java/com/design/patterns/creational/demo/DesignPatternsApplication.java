package com.design.patterns.creational.demo;

import java.awt.Color;
import java.awt.Dimension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.creational.abstractfactory.AbstractFactory;
import com.design.patterns.creational.abstractfactory.FactoryProvider;
import com.design.patterns.creational.abstractfactory.FactoryType;
import com.design.patterns.creational.abstractfactory.LollipopFactory;
import com.design.patterns.creational.builder.Bedroom;
import com.design.patterns.creational.builder.BedroomBuilder;
import com.design.patterns.creational.factorymethod.CandyType;
import com.design.patterns.creational.factorymethod.ChocolateFactory;
import com.design.patterns.creational.prototype.Breed;
import com.design.patterns.creational.prototype.Person;
import com.design.patterns.creational.prototype.Rabbit;
import com.design.patterns.creational.singleton.PrintSpooler;

/**
 * 
 * DesignPatternsApplication.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		///////////////////////////////////////////////////

		// Builder Design Pattern Sample.
		Bedroom bedroom = new BedroomBuilder()//
				.setDimensions(new Dimension(200, 100))//
				.setCellingHeight(132).setFloorNumber(2)//
				.setNumberOfDoors(4)//
				.setNumberOfWindows(16)//
				.setWallColor(Color.CYAN)//
				.build();
		logger.info("Builder Design Pattern {}", bedroom);

		///////////////////////////////////////////////////

		// Singleton Design Pattern Sample.
		PrintSpooler spooler = PrintSpooler.getInstance();
		logger.info("Singleton Design Pattern {}", spooler);

		///////////////////////////////////////////////////

		// Prototype Design Pattern Sample.
		// Original Rabbit
		Rabbit rabbit = new Rabbit(12, Breed.AMERICAN);
		rabbit.setOwner(new Person("Sally"));
		// Cloned Rabbit
		Rabbit clonedRabbit = rabbit.clone();
		clonedRabbit.setOwner(new Person("Steve"));
		logger.info("Prototype Design Pattern {}", clonedRabbit);

		///////////////////////////////////////////////////

		// Factory Method Design Pattern Sample.
		ChocolateFactory factory = new ChocolateFactory();
		factory.getCandyPackage(7, CandyType.CHOCOLATE_DARK);
		factory.getCandyPackage(10, CandyType.CHOCOLATE_WHITE);
		factory.getCandyPackage(17, CandyType.CHOCOLATE_MILK);
		factory.getCandyPackage(1, null);
		logger.info("Factory Method Design Pattern Completed !");

		///////////////////////////////////////////////////

		// Abstract Factory Design Pattern
		AbstractFactory<LollipopFactory> lollipopAbstractFactory = FactoryProvider.getFactory(FactoryType.LOLLIPOP);
		lollipopAbstractFactory.getCandyPackage(12, CandyType.LOLLIPOP_DUM_DUM);
		lollipopAbstractFactory.getCandyPackage(16, CandyType.LOLLIPOP_CHUPA_CHUPS);
		AbstractFactory<ChocolateFactory> chocolateAbstractFactory = FactoryProvider.getFactory(FactoryType.CHOCOLATE);
		chocolateAbstractFactory.getCandyPackage(71, CandyType.CHOCOLATE_DARK);
		chocolateAbstractFactory.getCandyPackage(110, CandyType.CHOCOLATE_WHITE);
		logger.info("Abstract Factory Design Pattern Completed !");

	}

}
