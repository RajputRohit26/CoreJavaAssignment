package com.assignment;

class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class ExtendsKey {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat(); 
        d.bark(); 
    }
}
