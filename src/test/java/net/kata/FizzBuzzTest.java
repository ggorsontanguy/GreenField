package net.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author guillaume@gorson-tanguy.net
 *
 */
public class FizzBuzzTest {

	@Test
	public final void should_return_Fizz_given_number_divisible_by3() {
		// given
		int number = 3;
		// when
		String actual = FizzBuzz.compute(number );
		// then
		String expected = "Fizz";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void should_return_the_number_given_number_not_divisible_by_3_or_5() {
		// given
		int number = 1;
		// when
		String actual = FizzBuzz.compute(number );
		// then
		String expected = String.valueOf(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void should_return_Buzz_given_number_divisible_by5() {
		// given
		int number = 5;
		// when
		String actual = FizzBuzz.compute(number );
		// then
		String expected = "Buzz";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void should_return_FizzBuzz_given_number_divisible_by_3_and_5() {
		// given
		int number = 15;
		// when
		String actual = FizzBuzz.compute(number );
		// then
		String expected = "FizzBuzz";
		Assert.assertEquals(expected, actual);
	}
}
