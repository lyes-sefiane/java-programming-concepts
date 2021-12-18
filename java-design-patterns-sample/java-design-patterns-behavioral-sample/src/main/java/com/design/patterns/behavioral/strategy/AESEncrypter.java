package com.design.patterns.behavioral.strategy;

/**
 * 
 * AESEncrypter.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class AESEncrypter implements Encrypter {

	@Override
	public String encryptFile() {
		return "Applying AES Encryption";
	}

}
