package com.lsefiane.beautiful.java.advanced.programming.generics.device;

/**
 * 
 * DeviceType.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 13, 2021
 *
 */
public enum DeviceType {

	BEAUTIFUL_JAVA("Beautiful Java"), //
	URGLY_NON_JAVA("Ugly Non Java");

	private String value;

	DeviceType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
