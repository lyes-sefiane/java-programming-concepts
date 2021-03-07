package com.lsefiane.beautiful.java.functional.programming.demo;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.lsefiane.beautiful.java.functional.programming.functioninterface.MyMath;

@SpringBootApplication
@ComponentScan(basePackages = "com.lsefiane.beautiful.java.functional.programming.*")
public class BeautifulJavaFunctionalProgrammingSampleApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(BeautifulJavaFunctionalProgrammingSampleApplication.class);

	@Autowired
	private MyMath myMath;

	public static void main(String[] args) {

		SpringApplication.run(BeautifulJavaFunctionalProgrammingSampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		///////////////////////////////////////////////////

		// Function Interface
		Function<Integer, Integer> myTriple = myMath::triple;
		Function<Integer, Integer> identity = Function.identity();

		// Function Interface Sample_V1.
		Integer result = myTriple.apply(5);
		logger.info("Result 1 : {}", result);

		// Function Interface Sample_V2.
		Integer result2 = myTriple.andThen(myTriple).apply(10);
		logger.info("Result 2 : {}", result2);

		// Function Interface Sample_V3.
		Integer result3 = myTriple.compose(myMath::devide).apply(20);
		logger.info("Result 3 : {}", result3);

		// Function Interface Sample_V4.
		logger.info("Result 4 : {}", identity.apply(1));

	}

}
