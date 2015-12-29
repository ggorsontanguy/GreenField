package net.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;


public class AppTest {

	private App app;
	
	@Before
	public void before() {
		app = new App();
	}
	

	@Test
	public void shouldReturn() {
		// GIVEN
		
		// WHEN
		String actual = "1";
		
		String expected = "1";
		
		// THEN
		assertThat(actual).isEqualTo(expected);
	}
	
}
