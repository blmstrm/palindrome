package com.blmstrm.palindromeTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.blmstrm.palindrome.PalindromeSearcher;
/**
 * A test class to verify the functionality of the PalindromeSearcher class.
 * @author Karl Blomström
 *
 */
public class TestPalindromeSearcher {
	
	private PalindromeSearcher testSearcher;
	
	/**
	 * A test method that initiates initial testing conditions by creating a new instance of the PalindromeSearcher class.
	 */
	@Before
	public void setup(){
		testSearcher = new PalindromeSearcher();
	}
	
	/**
	 * A test method to verify that the class correctly ignores a zero as the length of the factors
	 * making up a possible palindrome.
	 */
	@Test
	public void zeroDigitPalindrome(){
		assertEquals(0,testSearcher.findPalindrome(0));
	}
	
	/**
	 * A test method to verify that the class finds the correct palindrome with a factor length of one.
	 */
	@Test
	public void oneDigitPalindrome(){
		assertEquals(9,testSearcher.findPalindrome(1));
	}
	
	/**
	 * A test method to verify that the class finds the correct palindrome with a factor length of two.
	 */
	@Test
	public void twoDigitPalindrome(){
		assertEquals(9009,testSearcher.findPalindrome(2));
	}
	
	/**
	 * A test method to verify that the class finds the correct palindrome with a factor length of three.
	 */
	@Test
	public void threeDigitPalindrome(){
		assertEquals(906609,testSearcher.findPalindrome(3));
	}
	
	
	
}
