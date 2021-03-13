package com.lsefiane.beautiful.java.advanced.programming.generics.device.builder;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.BeautifulJavaDevice;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.DeviceType;

/**
 * 
 * BeautifulJavaDeviceBuilder.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 13, 2021
 *
 */
public class BeautifulJavaDeviceBuilder extends DeviceBuilder<BeautifulJavaDevice> {

	@Override
	public DeviceType getDeviceType() {
		return DeviceType.BEAUTIFUL_JAVA;
	}

	@Override
	public BeautifulJavaDevice build() {
		return new BeautifulJavaDevice(this);
	}

}
