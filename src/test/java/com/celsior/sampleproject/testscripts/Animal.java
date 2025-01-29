package com.celsior.sampleproject.testscripts;

import org.testng.annotations.Test;
 class Animal {
	// Method to be overridden
	 void speak() {
		 System.out.println("Different animal sounds");
	 }
	@Test
	  void main() {
		Tiger t = new Tiger();
		Dog d = new Dog();
		Cat c = new Cat();
		speak();
		t.speak();
		d.speak();
		d.speak("Dog Barks");
		c.speak();
		
	}
}

 class Dog extends Animal{
	@Test
	 void speak() {
		System.out.println("Dog barks: Woof Woof");
	}
	 void speak(String s) {
			System.out.println(s);
		}
}

 class Cat extends Animal{
	@Test
	 void speak() {
		System.out.println("Cat meows: Meow Meow");
	}
}
 class Tiger extends Animal{
	 void speak() {
			System.out.println("Tiger roares:  roar roar");
		}
 }

