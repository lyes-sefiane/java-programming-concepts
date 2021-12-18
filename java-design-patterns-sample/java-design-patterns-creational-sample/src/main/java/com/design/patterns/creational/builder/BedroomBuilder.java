package com.design.patterns.creational.builder;

import java.awt.Color;
import java.awt.Dimension;

public class BedroomBuilder implements Builder {

	Dimension dimensions;
	int cellingHeight;
	int floorNumber;
	Color wallColor;
	int numberOfWindows;
	int numberOfDoors;
	boolean isDouble;
	boolean hasEnsuite;

	public BedroomBuilder() {
	}

	@Override
	public BedroomBuilder setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	@Override
	public BedroomBuilder setCellingHeight(int cellingHeight) {
		this.cellingHeight = cellingHeight;
		return this;
	}

	@Override
	public BedroomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}

	@Override
	public BedroomBuilder setWallColor(Color wallColor) {
		this.wallColor = wallColor;
		return this;
	}

	@Override
	public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}

	@Override
	public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}

	public BedroomBuilder setDouble(boolean isDouble) {
		this.isDouble = isDouble;
		return this;
	}

	public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
		this.hasEnsuite = hasEnsuite;
		return this;
	}

	public Bedroom build() {
		return new Bedroom(this);
	}

}