package com.lsefiane.beautiful.java.functional.programming.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

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

		// Apply().
		Integer result = myTriple.apply(5);
		logger.info("Apply Triple : -> {}", result);

		// andThen().
		Integer result2 = myTriple.andThen(myTriple).apply(10);
		logger.info("Apply Triple and Then Triple : -> {}", result2);

		// compose().
		Integer result3 = myTriple.compose(myMath::divide).apply(20);
		logger.info("Compose Division and Then Apply Triple : -> {}", result3);

		// identity().
		logger.info("Identity : {}", identity.apply(1));

		///////////////////////////////////////////////////

		// Lambda Expressions
		// Current Interface : Function<Integer, Integer>
		// Preferred Interface : IntFunction<Integer>
		IntFunction<Integer> absoluteValue = x -> x < 0 ? -x : x;
		logger.info("Absolute value of {} is : {}", 10, absoluteValue.apply(10));

		///////////////////////////////////////////////////

		// BiFunction Interface
		IntBinaryOperator add = (a, b) -> a + b;
		logger.info("BiFunction<Integer, Integer, Integer> 10 + 3 = {}", add.applyAsInt(10, 3));

		///////////////////////////////////////////////////

		// Function as Arguments
		IntFunction<Integer> fn = a -> a + 2;
		logger.info("Function<Integer, Integer> as Argument,  3 + 2 = {}", myMath.add(3, fn));

		///////////////////////////////////////////////////

		// Closure
		Function<String, Supplier<String>> createGreeter = hello -> {
			String name = "Shaun";
			return () -> hello + name;
		};

		logger.info("Closure get result = {}", createGreeter.apply("Hello ").get());

		///////////////////////////////////////////////////

		// High-Order Function
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		logger.info("Higher Order Function Result = {} ", myMath.getList().apply(list, x -> x % 2 == 0));
	}

}
