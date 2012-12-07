package com.blmstrm.palindrome;
/**
 * A class to enable n to the power of m calculation and at the same time guard against overflowing the long primitive data type.
 * @author Karl Blomstrom
 * @version 0.1
 * */
public final class SafeOperations{

	/**
	 * Method that performs exponentiation using long a and long b throwing an exception if the result would overflow.
	 * @param a - the base.
	 * @param b - the exponent.
	 * @return - Returns the result of a to the power of b.
	 * @throws LongOverflowException if the operation overflows.
	 */
	public final static long safePow(long a, long b) throws LongOverflowException{
		int i = 0;

		long returnAnswer = 1;

		for(i=0;i<b;i++){
			returnAnswer = safeMultiplication(returnAnswer,a);
		}

		return returnAnswer;
	}

	/**
	 * Method that performs multiplication of long a and long bm and throws and exception if the result would overflow
	 * @param a - long factor.
	 * @param b - long factor.
	 * @return - Returns the result of the multiplication operation.
	 * @throws LongOverflowException
	 */
	public static long safeMultiplication(long a, long b) throws LongOverflowException{
		if(a <= Long.MAX_VALUE/b || b <= Long.MAX_VALUE/a){
			return a*b;
		}else{

			throw new LongOverflowException("Caught a long overflow.");
		
		}
	}

}



