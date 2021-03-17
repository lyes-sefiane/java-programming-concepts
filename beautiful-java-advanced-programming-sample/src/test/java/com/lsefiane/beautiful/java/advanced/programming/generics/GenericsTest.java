package com.lsefiane.beautiful.java.advanced.programming.generics;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.BeautifulJavaDevice;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.BeautifulJavaDeviceBuilder;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.UglyNonJavaDeviceBuilder;
import com.lsefiane.beautiful.java.advanced.programming.generics.session.SessionType;
import com.lsefiane.beautiful.java.advanced.programming.service.SessionService;

/**
 * 
 * GenericsTest.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 13, 2021
 *
 */
@ExtendWith(SpringExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class GenericsTest {

	@Autowired
	private SessionService sessionService;

	private Device beautifulJavaDevice;

	private Device uglyNonJavaDevice;

	@BeforeAll
	void setup() {

		beautifulJavaDevice = new BeautifulJavaDeviceBuilder()//
				.setIp("127.0. 0.1")//
				.setUsername("ADMIN")//
				.setPassword("ADMIN")//
				.build();

		uglyNonJavaDevice = new UglyNonJavaDeviceBuilder()//
				.setIp("0.0.0.0")//
				.setUsername("Unknown")//
				.setPassword("123!")//
				.build();

	}

	@Test
	@Order(0)
	void testTelnetSessionBeautifulJavaDeviceWithGenerics() {
		boolean isConnected = sessionService.connect(beautifulJavaDevice, SessionType.TELNET);
		assertTrue(isConnected);
	}

	@Test
	@Order(1)
	void testSshSessionBeautifulJavaDeviceWithGenerics() {
		boolean isConnected = sessionService.connect(beautifulJavaDevice, SessionType.SSH);
		assertTrue(isConnected);
	}

	@Test
	@Order(2)
	void testTelnetSessionUglyNonJavaDeviceWithGenerics() {
		assertThatThrownBy(() -> sessionService.connect(uglyNonJavaDevice, SessionType.TELNET))//
				.isInstanceOf(RuntimeException.class)//
				.hasMessage("Oops ! Exception Occurs While Processing Ugly Device Type ...");
	}

	@Test
	@Order(3)
	void testSshSessionUglyNonJavaDeviceWithGenerics() {
		assertThatThrownBy(() -> sessionService.connect(uglyNonJavaDevice, SessionType.SSH))//
				.isInstanceOf(RuntimeException.class)//
				.hasMessage("Oops ! Exception Occurs While Processing Ugly Device Type ...");
	}

	@Test
	@Order(4)
	void testUpperBoundedWildCardsWithGenerics() {
		List<? extends Device> devices = Arrays.asList(beautifulJavaDevice, uglyNonJavaDevice);
		assertEquals(2, devices.size());
	}

	@Test
	@Order(5)
	void testLowerBoundedWildCardsWithGenerics() {
		List<? super BeautifulJavaDevice> devices = Arrays.asList(beautifulJavaDevice, uglyNonJavaDevice);
		assertEquals(2, devices.size());
	}

}
