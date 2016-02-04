package net.kata;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoyageTest {

	@Test
	public void name_should_be_never_empty_given_any_town() {
		// GIVEN
		Town given = new Town();
		
		// WHEN
		String actual = given.getName();
		
		// THEN
		assertThat(actual).isNotEmpty();
	}
	
	@Test
	public void should_have_two_town_not_equals() {
		// GIVEN
		Town given_1 = new Town();
		Town given_2 = new Town();
		
		// WHEN
		boolean actual = given_1.getName().equals(given_2.getName());
		
		// THEN
		assertThat(actual).isFalse();
	}
	
}
