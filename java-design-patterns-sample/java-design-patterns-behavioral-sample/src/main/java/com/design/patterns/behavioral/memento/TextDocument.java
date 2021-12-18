package com.design.patterns.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * TextDocument.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 4, 2021
 *
 */
public class TextDocument {

	private static Logger logger = LoggerFactory.getLogger(TextDocument.class);

	private String text = "";

	private Memento memento = new Memento(text);

	public void write(String text) {
		this.text += text;
	}

	public void print() {
		logger.info("{}", text);
	}

	public void save() {
		memento.setState(text);
	}

	public void undo() {
		text = memento.getState();
	}

}
