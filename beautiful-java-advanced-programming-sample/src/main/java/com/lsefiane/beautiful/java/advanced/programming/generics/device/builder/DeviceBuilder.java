package com.lsefiane.beautiful.java.advanced.programming.generics.device.builder;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.DeviceType;

/**
 * 
 * DeviceBuilder.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 13, 2021
 *
 */
public abstract class DeviceBuilder<T extends Device> {

	private String ip;
	private String username;
	private String password;
	protected DeviceType deviceType;

	public abstract T build();

	public DeviceBuilder<T> setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public DeviceBuilder<T> setUsername(String username) {
		this.username = username;
		return this;
	}

	public DeviceBuilder<T> setPassword(String password) {
		this.password = password;
		return this;
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
		return getDeviceType();
	}

}
