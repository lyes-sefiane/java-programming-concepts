package com.lsefiane.beautiful.java.advanced.programming.generics.device.builder;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.DeviceType;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.UglyNonJavaDevice;

/**
 * 
 * UglyNonJavaDeviceBuilder.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 13, 2021
 *
 */
public class UglyNonJavaDeviceBuilder extends DeviceBuilder<UglyNonJavaDevice> {

	@Override
	public DeviceType getDeviceType() {
		return DeviceType.URGLY_NON_JAVA;
	}

	@Override
	public UglyNonJavaDevice build() {
		return new UglyNonJavaDevice(this);
	}

}
