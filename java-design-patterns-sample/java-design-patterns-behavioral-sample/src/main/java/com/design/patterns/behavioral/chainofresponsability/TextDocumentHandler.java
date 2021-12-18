package com.design.patterns.behavioral.chainofresponsability;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * TextDocumentHandler.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 24, 2021
 *
 */
public class TextDocumentHandler extends DocumentHandler {

	private static Logger logger = LoggerFactory.getLogger(TextDocumentHandler.class);

	public TextDocumentHandler(DocumentHandler next) {
		super(next);
	}

	@Override
	public void openDocument(FileExtension fileExtension) {
		if (fileExtension == FileExtension.TXT) {
			logger.info("Opening TXT Document ...");
		} else {
			super.openDocument(fileExtension);
		}
	}

}
