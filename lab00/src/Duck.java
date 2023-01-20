/******
	Name: Yueheng Yuan
	Assignment: 5004 Lab 0
	Date: 01/15/2023
	Notes: This class represents a book. A book has a title, an author and a price.
 */

public class Duck {
	private String name;
	private int age;
	private boolean hunger;
	
	/**
	 * Construct a Duck object that has the provided name, age and hunger status.
	 * 
	 * @param name the name to be given to this duck
	 * @param age the age to be given to this duck
	 * @param hunger the hunger status of this duck: whether it is hungry or not
	 */
	
	public Duck(String name, int age, boolean hunger) {
		this.name = name;
		this.age = age;
		this.hunger = hunger;
	}
	
	/**
	 * Return the name of this duck
	 * 
	 * @return the name of this duck
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Return the age of this duck
	 * 
	 * @return the age of this duck
	 */
	
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Return the hunger status of this duck
	 * 
	 * @return the hunger status of this duck
	 */
	
	public boolean getHunger() {
		return this.hunger;
	}
}

