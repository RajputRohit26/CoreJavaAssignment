package com.assignment;



abstract class Animal5 {
	 abstract void makeSound();
	 void sleep() {
	     System.out.println("This animal is sleeping.");
	 }
	}

	 class Dog5 extends Animal5 {
	 void makeSound() {
	     System.out.println(" dog Sound ");
	 }
	 
	 }
	public class Abstract {
		
		public static void main(String[] args) {
			Dog5 d=new Dog5();
			d.makeSound();
			d.sleep();
		}
	}