package com.design.patterns.behavioral.strategy;

/**
 * 
 * RSAEncrypter.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class RSAEncrypter implements Encrypter {

	@Override
	public String encryptFile() {
		return "Applying RSA Encryption";
	}

}
