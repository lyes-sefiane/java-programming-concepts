package com.lsefiane.beautiful.java.advanced.programming.generics.session;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;

/**
 * 
 * TelnetSession.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
@Component
@Scope("prototype")
@Qualifier("telnetSession")
public class TelnetSession extends BaseSession<Device> {

	public TelnetSession(Device device) {
		super(device, SessionType.TELNET);
	}
}
