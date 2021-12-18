package com.design.patterns.behavioral.chainofresponsability;

/**
 * 
 * DocumentHandler.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 24, 2021
 *
 */
public abstract class DocumentHandler {
	
	private DocumentHandler next;

	protected DocumentHandler(DocumentHandler next) {
		this.next = next;
	}
	
	public void openDocument(FileExtension fileExtension) {
		if(next != null) {
			next.openDocument(fileExtension);
		}
	}
}
