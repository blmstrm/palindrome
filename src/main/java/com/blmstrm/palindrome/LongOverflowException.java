package com.blmstrm.palindrome;
/**
 * A custom exception to catch overflow of long. 
 * @author Karl Blomstrom
 * @version 0.1
 *
 */
public class LongOverflowException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Method to call super class with user defined message.
	 * @param message - Message to send to sytem out.
	 */
	public LongOverflowException(String message){
		super(message);
	}

}
