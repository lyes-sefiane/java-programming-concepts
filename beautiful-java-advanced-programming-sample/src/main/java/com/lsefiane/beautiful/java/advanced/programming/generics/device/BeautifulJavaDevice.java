package com.lsefiane.beautiful.java.advanced.programming.generics.device;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.DeviceBuilder;

/**
 * 
 * BeautifulJavaDevice.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
public class BeautifulJavaDevice extends Device {

	public BeautifulJavaDevice(DeviceBuilder<BeautifulJavaDevice> beautifulJavaDeviceBuilder) {
		super(beautifulJavaDeviceBuilder);
	}

}
