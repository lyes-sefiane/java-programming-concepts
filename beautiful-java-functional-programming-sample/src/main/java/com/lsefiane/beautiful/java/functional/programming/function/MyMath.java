package com.lsefiane.beautiful.java.functional.programming.function;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * MyMath.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 7, 2021
 *
 */
@Component
@Scope("prototype")
public class MyMath {

	public Integer triple(Integer x) {
		return x * 3;
	}

	public Integer divide(Integer x) {
		return (int) (x / 2L);
	}

	public Integer add(Integer integer, IntFunction<Integer> function) {
		return function.apply(integer);
	}

	public BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> getList() {
		return (list, predicate) -> list.stream().filter(predicate).collect(Collectors.toList());
	}
}
