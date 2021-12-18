package com.design.patterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * InterpreterContext.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 1, 2021
 *
 */
public class InterpreterContext {

	public String getParameterPosition(String sentense) {
		String[] splitValue = sentense.split(":");
		return splitValue != null && splitValue.length > 0 ? splitValue[0] : "";
	}

	public List<String> getParameterValue(String sentense) {
		String[] splitValue = sentense.split(",");
		return splitValue != null && splitValue.length > 0 ? Arrays.asList(splitValue) : new ArrayList<>();
	}

}
