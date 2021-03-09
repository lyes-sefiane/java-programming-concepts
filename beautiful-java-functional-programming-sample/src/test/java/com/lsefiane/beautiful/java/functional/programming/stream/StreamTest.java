package com.lsefiane.beautiful.java.functional.programming.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 
 * StreamTest.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 9, 2021
 *
 */
@ExtendWith(SpringExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = Employee.class)
class StreamTest {

	private List<Employee> employees;

	@Autowired
	private ApplicationContext applicationContext;

	@BeforeAll
	void setup() {
		Employee bob = applicationContext.getBean(Employee.class, 1, "Bob", 15.0);
		Employee alice = applicationContext.getBean(Employee.class, 2, "Alice", 20.0);
		Employee jean = applicationContext.getBean(Employee.class, 3, "Jean", 35.0);

		employees = Arrays.asList(bob, alice, jean);
	}

	@Test
	@Order(0)
	void testMap() {

		List<Employee> employeeSalaryUpdate = employees.stream()//
				.map(employee -> new Employee(employee.getId(), employee.getName(), (employee.getSalary() * 0.02)))//
				.collect(Collectors.toList());

		assertEquals(3, employeeSalaryUpdate.size());
	}

	@Test
	@Order(1)
	void testFilter() {

		List<Employee> filteredEmployees = employees.stream()//
				.filter(employee -> employee.getSalary() % 2 == 0)//
				.collect(Collectors.toList());

		assertEquals(1, filteredEmployees.size());
	}

	@Test
	@Order(2)
	void testReduce() {

		double totalEmployeeSalaries = employees.stream()//
				.reduce(0d, (partialAgeResult, employee) -> partialAgeResult + employee.getSalary(), Double::sum);

		assertEquals(70.0, totalEmployeeSalaries);
	}

	@Test
	@Order(3)
	void testCollect() {

		String javaChampions = employees.stream()//
				.map(Employee::getName)//
				.collect(Collectors.joining(", "))//
				.concat(", Are Java Champions !");

		assertEquals("Bob, Alice, Jean, Are Java Champions !", javaChampions);
		
	}
}
