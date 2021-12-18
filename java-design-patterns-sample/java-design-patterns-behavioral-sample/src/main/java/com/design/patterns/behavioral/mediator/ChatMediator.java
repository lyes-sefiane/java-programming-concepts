package com.design.patterns.behavioral.mediator;

/**
 * 
 * ChatMediator.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);

}
