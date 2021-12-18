package com.design.patterns.behavioral.mediator;

/**
 * 
 * User.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public abstract class User {

	protected ChatMediator chatMediator;

	protected String name;

	protected User(ChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	public abstract void send(String message);

	public abstract void receive(String message);

}
