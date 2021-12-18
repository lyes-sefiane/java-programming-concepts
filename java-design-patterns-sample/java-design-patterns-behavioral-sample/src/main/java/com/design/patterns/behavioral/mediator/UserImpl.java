package com.design.patterns.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * UserImpl.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public class UserImpl extends User {

	private static Logger logger = LoggerFactory.getLogger(UserImpl.class);

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String message) {
		logger.info("{} sending message : {}", name, message);
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		logger.info("{} received message : {}", name, message);
	}

}
