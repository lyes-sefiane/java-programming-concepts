package com.design.patterns.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 
 * Connection.java
 * 
 * Observable
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 5, 2021
 *
 */
public class Connection {

	private String status = "";

	private PropertyChangeSupport support = new PropertyChangeSupport(this);

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		support.firePropertyChange("status", this.status, status);
		this.status = status;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

}
