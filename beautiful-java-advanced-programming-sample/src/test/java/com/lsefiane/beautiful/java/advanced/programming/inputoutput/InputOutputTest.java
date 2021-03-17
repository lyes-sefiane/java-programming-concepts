package com.lsefiane.beautiful.java.advanced.programming.inputoutput;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 
 * InputOutputTest.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 17, 2021
 *
 */
@ExtendWith(SpringExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class InputOutputTest {

	private String expectedData = "Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines."
			+ "The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.";

	private Path directoryPath = Paths.get("src\\test\\resources");

	private Path pathToFile = directoryPath.resolve("bufferedReaderTest.txt");

	@Test
	@Order(0)
	void testBufferedReader() throws IOException {

		String loadedText = Files.newBufferedReader(pathToFile).lines().collect(Collectors.joining(""));

		assertTrue(expectedData.equalsIgnoreCase(loadedText));
	}

	@Test
	@Order(1)
	void testTryWithResources() throws IOException {

		try (BufferedReader reader = Files.newBufferedReader(pathToFile);) {

			String loadedText = reader.lines().collect(Collectors.joining(""));

			assertTrue(expectedData.equalsIgnoreCase(loadedText));
		}
	}

}
