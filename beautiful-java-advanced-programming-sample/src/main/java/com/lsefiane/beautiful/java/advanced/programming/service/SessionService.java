package com.lsefiane.beautiful.java.advanced.programming.service;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.DeviceType;
import com.lsefiane.beautiful.java.advanced.programming.generics.session.Session;
import com.lsefiane.beautiful.java.advanced.programming.generics.session.SessionType;
import com.lsefiane.beautiful.java.advanced.programming.generics.session.SshSession;
import com.lsefiane.beautiful.java.advanced.programming.generics.session.TelnetSession;

/**
 * 
 * SessionService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 12, 2021
 *
 */
@Service
public class SessionService {

	@Autowired
	private ApplicationContext applicationContext;

	public boolean connect(@NotNull(message = "Device Should Not Be Null !") Device device,
			@NotNull(message = "Session Type Should Not Be Null !") SessionType sessionType) {

		if (device.getDeviceType() == DeviceType.URGLY_NON_JAVA) {
			throw new IllegalArgumentException("Oops ! Exception Occurs While Processing Ugly Device Type ...");
		}

		Session session;

		switch (sessionType) {
		case TELNET:
			session = applicationContext.getBean(TelnetSession.class, device);
			break;
		case SSH:
			session = applicationContext.getBean(SshSession.class, device);
			break;
		default:
			throw new UnsupportedOperationException("Unsupported Session Type " + sessionType);
		}

		return session.loginAndThenDisconnect();
	}
}
