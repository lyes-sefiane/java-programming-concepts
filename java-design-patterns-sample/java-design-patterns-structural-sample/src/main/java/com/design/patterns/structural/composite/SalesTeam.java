package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * SalesTeam.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 20, 2021
 *
 */
public class SalesTeam implements Payee {

	List<Payee> payees = new ArrayList<>();

	public void addPayees(Payee payee) {
		payees.add(payee);
	}

	@Override
	public String payExpenses(int amount) {
		return payees.stream().map(payee -> payee.payExpenses(amount)).collect(Collectors.joining(", "));
	}

}
