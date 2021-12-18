package com.design.patterns.behavioral.chainofresponsability;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * SpreadSheetHandler.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 24, 2021
 *
 */
public class SpreadSheetHandler extends DocumentHandler {

	private static Logger logger = LoggerFactory.getLogger(SpreadSheetHandler.class);

	public SpreadSheetHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(FileExtension fileExtension) {
		if (fileExtension == FileExtension.XLS) {
			logger.info("Opening Spread Document ...");
		} else {
			super.openDocument(fileExtension);
		}
	}

}
