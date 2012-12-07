package com.blmstrm.palindromeTests;
import org.junit.Test;

import com.blmstrm.palindrome.*;

/**
 *A test class to verify the functionality of the SafeOperations class which methods prevent overflow.
 * @author Karl Blomström
  */
public class TestSafeOperations {

	/**
	 * A test method to verify that the LongOverflowException is thrown when the product of the values of the two
	 * integers fed to the safePow() method would cause an overflow. 
	 * @throws LongOverflowException
	 */
	
	@Test(expected=LongOverflowException.class)
	public void catchOverflowingLong() throws LongOverflowException{
		SafeOperations.safeMultiplication(99999999999999L,99999999999999L);
	}


}
