package com.lsefiane.beautiful.java.functional.programming.functioninterface;

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

	public Integer devide(Integer x) {
		return (int) (x / 2L);
	}
}
