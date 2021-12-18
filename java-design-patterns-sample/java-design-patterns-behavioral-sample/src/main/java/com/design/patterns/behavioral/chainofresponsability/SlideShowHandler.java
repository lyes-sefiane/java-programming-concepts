package com.design.patterns.behavioral.chainofresponsability;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * SlideShowHandler.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 24, 2021
 *
 */
public class SlideShowHandler extends DocumentHandler {

	private static Logger logger = LoggerFactory.getLogger(SlideShowHandler.class);

	public SlideShowHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(FileExtension fileExtension) {
		if (fileExtension == FileExtension.PPT) {
			logger.info("Opening Slides Document ...");
		} else {
			super.openDocument(fileExtension);
		}
	}

}
