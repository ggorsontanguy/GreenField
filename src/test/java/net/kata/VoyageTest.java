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
	
	
}
