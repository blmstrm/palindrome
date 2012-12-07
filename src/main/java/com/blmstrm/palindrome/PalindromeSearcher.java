package com.blmstrm.palindrome;
/**
 * A class that finds the largest palindrome as a product of two numbers of n digits length.
 * @author Karl Blomstrom
 * @version 0.1
 */
public class PalindromeSearcher {

	private long numberOfDigits = 0L;
	private long maximumValue = 0L;
	private long minimumValue = 0L;
	private PalindromeVerifier palindromeVerifier;

	/**
	 * Constructor which initializes an instance of a PalindromeVerifyer.
	 */
	public PalindromeSearcher(){

		this.palindromeVerifier = new PalindromeVerifier();

	}


	/**
	 * Method to find the largest palindrome being a product of two n-digit numbers.
	 * Throws a LongOverflowException if a multiplication of an integer overflows.
	 * @param nDigits - number of digits in each factor.
	 * @return Returns zero if no palindromes were found or if nDigits is set to zero. Otherwise the largest palindrome is returned.
	 */
	public long findPalindrome(long nDigits){

		boolean foundPalindrome = false;

		long currentValue = 0L;
		long currentFactor = 0L;

		long lengthA = 0L;
		long lengthB = 0L;
		long biggestNumber = 0L;

		if(nDigits > 0){
			this.numberOfDigits = (long)nDigits;

			try {
				this.maximumValue = (long)SafeOperations.safePow(10, nDigits)-1;
				this.minimumValue = (long) SafeOperations.safePow(10, nDigits-1);
				biggestNumber = (long)SafeOperations.safeMultiplication(maximumValue, maximumValue);
			} catch (LongOverflowException e) {
				System.err.println(e);
				System.exit(0);
			}

			outerLoop:
				for(currentValue = biggestNumber;currentValue >=this.minimumValue; currentValue--){

					if(palindromeVerifier.isLongPalindrome(currentValue)){

						for(currentFactor=this.maximumValue;currentFactor>=this.minimumValue;currentFactor--){

							if(currentValue%currentFactor == 0){
								lengthA = Long.toString(currentFactor).length();
								lengthB = Long.toString(currentValue/currentFactor).length();

								if(lengthA == numberOfDigits && lengthB == numberOfDigits){
									foundPalindrome = true;
									break outerLoop;
								}
							}
						}
					}

					currentFactor = this.maximumValue;
				}

			if(foundPalindrome){
				return currentValue;
			}
		}
		return 0;
	}
}
