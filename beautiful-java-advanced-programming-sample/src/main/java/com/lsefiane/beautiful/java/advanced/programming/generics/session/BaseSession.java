package com.lsefiane.beautiful.java.advanced.programming.generics.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;

/**
 * 
 * BaseSession.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
public abstract class BaseSession<T extends Device> implements Session {

	protected static Logger logger = LoggerFactory.getLogger(BaseSession.class);

	protected T device;
	protected SessionType sessionType;

	/**
	 * Base Session
	 * 
	 * @param device
	 * @param sessionType
	 */
	protected BaseSession(T device, SessionType sessionType) {
		this.device = device;
		this.sessionType = sessionType;
	}

	private boolean connect() {
		logger.info("Connecting to Device = {}, IP = {}, Session = {}", device.getDeviceType().getValue(),
				device.getIp(), sessionType);
		return true;
	}

	private boolean disconnect() {
		logger.info("Disconnecting from Device = {}, IP = {}, Session = {}", device.getDeviceType().getValue(),
				device.getIp(), sessionType);
		return true;
	}

	@Override
	public boolean loginAndThenDisconnect() {
		if (connect()) {
			logger.info("Processing ....");
			return disconnect();
		}
		return false;
	}

}
