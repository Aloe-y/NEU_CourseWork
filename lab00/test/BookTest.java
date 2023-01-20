/******
Name: Yueheng Yuan
Assignment: 5004 Lab 0
Date: 01/15/2023
Notes: test the Book class
******/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * A JUnit test class for the Book class.
 */

public class BookTest {
	
	private Book hamlet;
	private Person william;

	@Before
	public void setup() {
		william = new Person("William", "Shakespeare", 1564);
		hamlet = new Book("Hamlet", william, 12.87F);
	}
	
	 @Test
	 public void testTitle() {
		 assertEquals("Hamlet", hamlet.getTitle());

	  }

	  @Test
	  public void testPrice() {
		  // The last argument stands for precision.
		  assertEquals(12.87F, hamlet.getPrice(), 0.001);
	  }

	  @Test
	  public void testAuthor() {
		  assertEquals(william, hamlet.getAuthor());
		  assertEquals("William", william.getFirstName());
		  assertEquals("Shakespeare", william.getLastName());
		  assertEquals(1564, william.getYearOfBirth());
	  }

}
