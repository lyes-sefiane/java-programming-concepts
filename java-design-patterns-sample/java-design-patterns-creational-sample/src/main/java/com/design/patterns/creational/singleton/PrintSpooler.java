package com.design.patterns.creational.singleton;

/**
 * 
 * PrintSpooler.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 7, 2021
 *
 */
public class PrintSpooler {

	private static volatile PrintSpooler spooler;

	private PrintSpooler() {
		//
	}

	/**
	 * Thread-Safe Singleton
	 * 
	 * @return Instance
	 */
	public static PrintSpooler getInstance() {
		if (spooler == null) {
			synchronized (PrintSpooler.class) {
				if (spooler == null) {
					spooler = new PrintSpooler();
				}
			}
		}
		return spooler;
	}

	@Override
	public String toString() {
		return "PrintSpooler [toString()=" + super.toString() + "]";
	}
}
