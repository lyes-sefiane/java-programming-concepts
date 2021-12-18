package com.design.patterns.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * File.java
 * 
 * Context
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class File {

	private static Logger logger = LoggerFactory.getLogger(File.class);

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	public void encrypt(Encrypter encrypter) {
		logger.info("{} to {}", encrypter.encryptFile(), fileName);
	}

}
