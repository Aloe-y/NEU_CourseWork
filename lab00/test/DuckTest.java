/******
Name: Yueheng Yuan
Assignment: 5004 Lab 0
Date: 01/15/2023
Notes: test the Person class
******/

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Duck class.
 */

public class DuckTest {
	
	private Duck quack;

	@Before 
	public void setUp() {
		quack = new Duck("Quack", 1, true);
	}
	
	@Test 
	public void testName() {
		assertEquals("Quack", quack.getName());
	}
	
	@Test
	public void testAge() {
		assertEquals(1, quack.getAge());
	}
	
	@Test
	public void testHunger() {
		assertEquals(true, quack.getHunger());
	}
}
