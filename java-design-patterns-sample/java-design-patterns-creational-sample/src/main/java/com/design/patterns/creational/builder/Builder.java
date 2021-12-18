package com.design.patterns.creational.builder;

import java.awt.Color;
import java.awt.Dimension;

/**
 * 
 * Builder.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 7, 2021
 *
 */
public interface Builder {

	Builder setDimensions(Dimension dimensions);

	Builder setCellingHeight(int cellingHeight);

	Builder setFloorNumber(int floorNumber);

	Builder setWallColor(Color wallColor);

	Builder setNumberOfWindows(int numberOfWindows);

	Builder setNumberOfDoors(int numberOfDoors);

}