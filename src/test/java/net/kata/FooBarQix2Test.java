package net.kata;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author tafni.amar@gmail.com
 *
 */
public class FooBarQix2Test {

	@Test
	public final void should_return_Foo_given_number_divisible_by_3_not_contain_3() {
		
		// GIVEN
		int number = 9;
		//WHEN
		String actual = compute(number);
		String expected="Foo";
		// THEN
		assertEquals(expected, actual);
		
	}
	
	@Test
	public final void should_return_number_given_number_not_divisible_by_3() {
		
		// GIVEN
		int number = 10;
		//WHEN
		String actual = compute(number);
		String expected=String.valueOf(number);
		// THEN
		assertEquals(expected, actual);
		
	}
	
	@Test
	public final void should_return_FooFoo_given_number_divisible_by_3_contain_3() {
		
		// GIVEN
		int number = 3;
		//WHEN
		String actual = compute(number);
		String expected="FooFoo";
		// THEN
		assertEquals(expected, actual);
		
	}
	
	@Test
	public final void should_return_FooFooFoo_given_number_divisible_by_3_contain_twice_3() {
		
		// GIVEN
		int number = 33;
		//WHEN
		String actual = compute(number);
		String expected="FooFooFoo";
		// THEN
		assertEquals(expected, actual);
		
	}

	private String compute(int number) {
		if(number % 3 == 0){
			String goodValue ="Foo";
			int nbOccu = 0;
			Matcher macher = Pattern.compile("3").matcher(String.valueOf(number));
			while (macher.find()) {
				nbOccu++;
			};
			for (int i = 1; i <= nbOccu; i++) {
				goodValue+="Foo";
			}
			return goodValue;
		}else {
			return String.valueOf(number);
		}
	}
}
