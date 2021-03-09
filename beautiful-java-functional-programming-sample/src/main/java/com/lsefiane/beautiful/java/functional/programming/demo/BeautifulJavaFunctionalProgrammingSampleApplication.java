package com.lsefiane.beautiful.java.functional.programming.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lsefiane.beautiful.java.functional.programming.*")
public class BeautifulJavaFunctionalProgrammingSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeautifulJavaFunctionalProgrammingSampleApplication.class, args);
	}
}
