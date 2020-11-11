package org.springframework.samples.petclinic;

abstract class Person {

	public String fname = "Jhon";

	public int age = 24;

	public abstract void study();

}

class Student extends Person {

	public int graduationYear = 2018;

	public void study() {
		System.out.println("Studying all day long");
	}

}

abstract class Dog {

	public int leg = 4;

}

class KindDog extends Dog {

}