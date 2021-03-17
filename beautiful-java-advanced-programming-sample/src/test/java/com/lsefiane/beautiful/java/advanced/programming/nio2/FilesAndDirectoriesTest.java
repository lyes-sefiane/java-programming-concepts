package com.lsefiane.beautiful.java.advanced.programming.nio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
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
 * FilesAndDirectoriesTest.java
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
class FilesAndDirectoriesTest {

	private Path directoryPath = Paths.get("src\\test\\resources");

	private Path filePath = directoryPath.resolve("filesAndDirectoriesTest.txt");

	@Test
	@Order(0)
	void testFileOrDirectoryExists() {
		assertFalse(Files.exists(filePath));
	}

	@Test
	@Order(1)
	void testFileCreation() throws IOException {
		assertTrue(Files.exists((Files.createFile(filePath))));
	}

	@Test
	@Order(2)
	void testFileCopy() throws IOException {
		Path fileCopyPath = directoryPath.resolve("filesAndDirectoriesTestCopy.txt");
		Files.copy(filePath, fileCopyPath, StandardCopyOption.REPLACE_EXISTING);
		assertTrue(Files.exists(fileCopyPath));
	}

	@Test
	@Order(3)
	void testDirectoryContent() throws IOException {
		List<String> directoryContents = Files.list(directoryPath)//
				.filter(path -> !Files.isDirectory(path))//
				.map(path -> path.getFileName().toString())//
				.collect(Collectors.toList());
		assertEquals(3, directoryContents.size());
	}

	@Test
	@Order(4)
	void testFileDeletion() throws IOException {
		assertTrue(Files.deleteIfExists(filePath));
	}

}
