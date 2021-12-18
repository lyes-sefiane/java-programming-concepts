package com.design.patterns.behavioral.strategy;

/**
 * 
 * Encrypter.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public interface Encrypter {

	public String encryptFile();

	Encrypter aesEncrypter = () -> "Applying AES Encryption";

	Encrypter rsaEncrypter = () -> "Applying RSA Encryption";

}
