package net.kata;

import org.junit.Test;

import static net.kata.Town.Name.*;

import static org.assertj.core.api.Assertions.assertThat;


public class VoyageTest {

	@Test
	public void name_should_be_never_empty_given_any_town() {
		// GIVEN
		Town given = new Town(PARIS);
		
		// WHEN
		String actual = given.getName();
		
		// THEN
		assertThat(actual).isNotEmpty();
	}
	
	@Test
	public void should_have_two_town_not_equals() {
		// GIVEN
		Town given_1 = new Town(PARIS);
		Town given_2 = new Town(LYON);
		
		// WHEN
		boolean actual = given_1.getName().equals(given_2.getName());
		
		// THEN
		assertThat(actual).isFalse();
	}
	
	@Test
	public void should_have_same_town_be_equals_itself() {
		// GIVEN
		Town given_1 = new Town(PARIS);
		Town given_2 = new Town(PARIS);
		
		// WHEN
		boolean actual = given_1.getName().equals(given_2.getName());
		
		// THEN
		assertThat(actual).isTrue();
	}
	
}
