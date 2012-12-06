package com.blmstrm.palindromeTests;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.blmstrm.palindrome.PalindromeVerifier;
/**
 * A test class to test the functionality of the PalindromeVerifyer class.
 * @author Karl Blomström
 *
 */
public class TestPalindromeVerifier {

	private PalindromeVerifier testChecker;
	
	private int intPalindrome = 12321;
	private int notIntPalindrome = 12322;
	
	

	/**
	 * A test method that initiates initial testing conditions by creating a new instance of the PalindromeVerifyer class.
	 */
	@Before
	public void setup(){
		testChecker = new PalindromeVerifier();
	}
	
	/**
	 * A test method to verify that a palindrome is indeed classified as a palindrome.
	 */
	@Test
	public void isPalindrome(){

	boolean answer = false;
	
	answer =  testChecker.isLongPalindrome(intPalindrome);

	assertEquals(true, answer);
	}
	
	/**
	 * A test method to verify that a number that is not a palindrome is not classified as a palindrome
	 */
	@Test
	public void isNotPalindrome(){

		boolean answer = false;
		
		answer = testChecker.isLongPalindrome(notIntPalindrome);
		
		assertEquals(false,answer);
	}

}
