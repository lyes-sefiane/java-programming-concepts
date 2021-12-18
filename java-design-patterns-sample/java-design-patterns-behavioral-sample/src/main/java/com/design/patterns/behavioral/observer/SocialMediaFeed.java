package com.design.patterns.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * SocialMediaFeed.java
 * 
 * Observer
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 5, 2021
 *
 */
public class SocialMediaFeed implements PropertyChangeListener {

	private static Logger logger = LoggerFactory.getLogger(SocialMediaFeed.class);

	private List<String> statuses = new ArrayList<>();

	public void printStatuses() {
		logger.info("{}", statuses);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		statuses.add((String) evt.getNewValue());
		printStatuses();
	}

}
