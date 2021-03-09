package com.lsefiane.beautiful.java.functional.programming.function;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

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

/**
 * 
 * FunctionTest.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 9, 2021
 *
 */
@ExtendWith(SpringExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = MyMath.class)
class FunctionTest {

	@Autowired
	private MyMath myMath;

	private Function<Integer, Integer> myTriple;

	private Function<Integer, Integer> identity;

	@BeforeAll
	void setup() {
		myTriple = myMath::triple;
		identity = Function.identity();
	}

	@Test
	@Order(0)
	void testFunctionApply() {
		assertEquals(15, myTriple.apply(5));
	}

	@Test
	@Order(1)
	void testFunctionApplyAndThen() {
		assertEquals(90, myTriple.andThen(myTriple).apply(10));
	}

	@Test
	@Order(2)
	void testFunctionCompose() {
		assertEquals(30, myTriple.compose(myMath::divide).apply(20));
	}

	@Test
	@Order(3)
	void testFunctionIdentity() {
		assertEquals(1, identity.apply(1));
	}

	@Test
	@Order(4)
	void testLambdaExpression() {
		// Lambda Expressions
		// Current Interface : Function<Integer, Integer>
		// Preferred Interface : IntFunction<Integer>
		IntFunction<Integer> absoluteValue = x -> x < 0 ? -x : x;
		assertEquals(10, absoluteValue.apply(10));
	}

	@Test
	@Order(5)
	void testBiFunction() {
		IntBinaryOperator add = (a, b) -> a + b;
		assertEquals(13, add.applyAsInt(10, 3));
	}

	@Test
	@Order(6)
	void testFunctionAsArgument() {
		IntFunction<Integer> fn = a -> a + 2;
		assertEquals(5, myMath.add(3, fn));
	}

	@Test
	@Order(7)
	void testClosure() {
		Function<String, Supplier<String>> createGreeter = hello -> {
			String name = "Shaun";
			return () -> hello + name;
		};
		assertEquals("Hello Shaun", createGreeter.apply("Hello ").get());
	}

	@Test
	@Order(8)
	void testHighOrderFunction() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		assertEquals("[2, 4, 6]", myMath.getList().apply(list, x -> x % 2 == 0).toString());
	}

}
