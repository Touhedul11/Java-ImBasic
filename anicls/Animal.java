package com.touhe.anicls;

public class Animal {

	int age;
	int size;
	String gender;
	String type;
	String tail;
	public Animal(int age, int size, String gender, String type, String tail) {
		super();
		this.age = age;
		this.size = size;
		this.gender = gender;
		this.type = type;
		this.tail = tail;
		
	}
	
	  public void speak() {
		  System.out.println("My age is " + age);
		  System.out.println("My size is " + age);
		  System.out.println("I am a " + gender);
		  System.out.println("I am " + type);
		  System.out.println("I have " + tail);
	  }
	
	
	
}
