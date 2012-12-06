package com.blmstrm.palindrome;
/**
 * A class to find out if a long is a palindrome or not.
 * So far only integer/long palindromes are supported.
 * @author Karl Blomstrom
 * @version 0.1
 */
public class PalindromeVerifier {

	/**
	 *A method to verify if an integer/long is a palindrome or not.
	 * @param inPalindrome - Input long.
	 * @return true if inPalindrome is a palindrome, false if not.
	 */
	public boolean isLongPalindrome(long inPalindrome){

		String integerA = new String();
		String integerB = new String();
		StringBuffer tempBuff = new StringBuffer();
		
		integerA = Long.toString(inPalindrome);
		
		tempBuff.append(integerA);
		
		tempBuff.reverse();
		
		integerB = tempBuff.toString();
		
		
		if(integerA.equals(integerB)){
			return true;
		}else{
			return false;
		}
		
	}
}
