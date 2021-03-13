package com.lsefiane.beautiful.java.advanced.programming.generics.device;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.DeviceBuilder;

/**
 * 
 * Device.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
public class Device {

	protected String ip;
	protected String username;
	protected String password;
	protected DeviceType deviceType;

	protected Device(DeviceBuilder<? extends Device> deviceBuilder) {
		ip = deviceBuilder.getIp();
		username = deviceBuilder.getUsername();
		password = deviceBuilder.getPassword();
		deviceType = deviceBuilder.getDeviceType();
	}

	public String getIp() {
		return ip;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	@Override
	public String toString() {
		return "Device [ip=" + ip + ", username=" + username + ", deviceType=" + deviceType + "]";
	}
}
