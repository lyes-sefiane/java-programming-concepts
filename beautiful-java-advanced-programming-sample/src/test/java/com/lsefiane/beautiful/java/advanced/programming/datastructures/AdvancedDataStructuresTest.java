package com.lsefiane.beautiful.java.advanced.programming.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lsefiane.beautiful.java.advanced.programming.generics.device.Device;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.BeautifulJavaDeviceBuilder;
import com.lsefiane.beautiful.java.advanced.programming.generics.device.builder.UglyNonJavaDeviceBuilder;

/**
 * 
 * AdvancedDataStructures.java
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
class AdvancedDataStructuresTest {

	private Queue<Device> devices = new LinkedList<>();

	private Map<String, Device> map;

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

		devices.add(beautifulJavaDevice);
		devices.add(uglyNonJavaDevice);

	}

	@Test
	@Order(0)
	void testQueuePeekElement() {
		Device polledDevice = devices.peek();
		assertEquals(polledDevice, beautifulJavaDevice);
	}

	@Test
	@Order(1)
	void testQueueSizeWithPoll() {
		devices.poll();
		assertEquals(1, devices.size());
	}

	@Test
	@Order(1)
	void testHashmap() {
		// Order is no guarantee. 
		map = new HashMap<>();
		map.put("One", beautifulJavaDevice);
		map.put("Five", uglyNonJavaDevice);
		assertTrue(
				"{Five=Device [ip=0.0.0.0, username=Unknown, deviceType=URGLY_NON_JAVA], One=Device [ip=127.0. 0.1, username=ADMIN, deviceType=BEAUTIFUL_JAVA]}"
						.equalsIgnoreCase(map.toString()));
	}
	
	@Test
	@Order(2)
	void testLinkedHashmap() {
		// Order is guarantee. 
		map = new LinkedHashMap<>();
		map.put("One", beautifulJavaDevice);
		map.put("Five", uglyNonJavaDevice);
		assertTrue(
				"{One=Device [ip=127.0. 0.1, username=ADMIN, deviceType=BEAUTIFUL_JAVA], Five=Device [ip=0.0.0.0, username=Unknown, deviceType=URGLY_NON_JAVA]}"
						.equalsIgnoreCase(map.toString()));
	}

}
