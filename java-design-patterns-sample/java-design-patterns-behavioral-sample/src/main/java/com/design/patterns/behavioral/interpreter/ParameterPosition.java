package com.design.patterns.behavioral.interpreter;

/**
 * 
 * ParameterPosition.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 1, 2021
 *
 */
public class ParameterPosition implements Expression {

	private String sentense;

	public ParameterPosition(String sentense) {
		this.sentense = sentense;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getParameterPosition(sentense);
	}

}
