package com.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ChatMediatorImpl.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 3, 2021
 *
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<User> users = new ArrayList<>();

	@Override
	public void sendMessage(String msg, User user) {
		users.stream().filter(usr -> !usr.name.equalsIgnoreCase(user.name)).forEach(usr -> usr.receive(msg));
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

}
