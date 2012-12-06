package com.blmstrm.palindrome;
/**
 * A class to find the largest palindrome made from the product of two 3-digit numbers.
 * @author Karl Blomstrom
 * @version 0.1
 * 
 * */
public class Main {

	/**
	 * Main method to find solution of the problem in question.
	 * Calculates and prints the largest palindrome made from the product of two 3-digit numbers.
	 * @param args - Eventual input argumets.
	 */
	public static void main(String[] args) {

		long palindrome = 0;

		PalindromeSearcher tempSearcher = new PalindromeSearcher();

		palindrome = tempSearcher.findPalindrome(3);
		
		System.out.println("The largest palindrome made from two 3-digit numbers is "+palindrome);

	}

}
