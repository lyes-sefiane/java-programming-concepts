package com.design.patterns.structural.proxy.virtual;

import java.nio.file.Path;

/**
 * 
 * ImageProxy.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 23, 2021
 *
 */
public class ImageProxy implements Image {

	private Path imageFilePath;

	private Image image;

	public ImageProxy(Path imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	@Override
	public void showImage() {
		image = new HeavyImage(imageFilePath);
		image.showImage();
	}

}
