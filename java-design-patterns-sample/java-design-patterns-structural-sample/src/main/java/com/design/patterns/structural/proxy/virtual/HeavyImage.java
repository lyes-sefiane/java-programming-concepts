package com.design.patterns.structural.proxy.virtual;

import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * HeavyImage.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 23, 2021
 *
 */
public class HeavyImage implements Image {

	private static Logger logger = LoggerFactory.getLogger(HeavyImage.class);

	private Path imageFilePath;

	public HeavyImage(Path imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	private boolean loadImage(Path imageFilePath) {
		logger.info("Loading Image From : {} ", imageFilePath);
		return true;
	}

	@Override
	public void showImage() {
		boolean isLoaded = loadImage(imageFilePath);
		logger.info(isLoaded ? "Image Displayed Sucessfully." : "Exception Occurs While Loading the Image");
	}

}
