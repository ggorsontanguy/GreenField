package net.kata;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * @author guillaume@gorson-tanguy.net
 *
 */
public class FooBarQixTest {

	@Test
	@Ignore
	public final void should_return_Foo_given_number_divisible_by_3() {
		// given
		int number = 6;
		// when
		String actual = compute(number );
		// then
		String expected = "Foo";
		assertEquals(expected, actual);
	}
	
	@Test
	@Ignore
	public final void should_return_FooFoo_given_number_divisible_by_3_and_contains_digit_3() {
		// given
		int number = 3;
		// when
		String actual = compute(number );
		// then
		String expected = "Foo";
		assertEquals(expected, actual);
	}

	private String compute(int number) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
