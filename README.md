palindrome
==========

Java classes that finds the biggest palindrome being a product of two factors of n digits.

For source code javadocs see:

http://www.blmstrm.com/palindrome/apidocs/index.html

and for unit test javadocs:

http://www.blmstrm.com/palindrome/testapidocs/index.html

To compile & install the project, while in the root directory where the `pom.xml` file resides, type:

`mvn install`

The jar file obtained if executed will calculate and display the biggest palindrome being a product of two 3-digit numbers.

The method `findPalindrome(long nDigits)` can take any valid `long` as input and will compute the biggest palindrome as a product of two factors with `nDigits` digits.

The value of `nDigits` can be changed by altering the source code.

Should a `long` overflow happen the program will halt.




