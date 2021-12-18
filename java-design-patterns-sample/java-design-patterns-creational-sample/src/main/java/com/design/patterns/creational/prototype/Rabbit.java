package com.design.patterns.creational.prototype;

/**
 * 
 * Rabbit.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 7, 2021
 *
 */
public class Rabbit implements Cloneable {

	private int age;
	private Breed breed;
	private Person owner;

	public Rabbit(int age, Breed breed) {
		this.age = age;
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Rabbit [age=" + age + ", breed=" + breed + ", owner=" + owner + "]";
	}

	@Override
	public Rabbit clone() {
		try {
			Rabbit rabbit = (Rabbit) super.clone();
			rabbit.owner = owner.clone();
			return rabbit;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
