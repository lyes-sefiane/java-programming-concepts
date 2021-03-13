package com.lsefiane.beautiful.java.advanced.programming.generics.device;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.DeviceBuilder;

/**
 * 
 * UrglyNonJavaDevice.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
public class UglyNonJavaDevice extends Device {

	public UglyNonJavaDevice(DeviceBuilder<UglyNonJavaDevice> deviceBuilder) {
		super(deviceBuilder);
	}

}
