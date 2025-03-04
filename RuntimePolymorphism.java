package com.assignment;



class Animal3 {
    void sound1() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog3 extends Animal3 {
    @Override
    void sound1() {
        System.out.println("The dog barks.");
    }
}

class Cat3 extends Animal3 {
    @Override
    void sound1(){
        System.out.println("The cat meows.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
       Cat3 x=new Cat3();
       Dog3 y=new Dog3();
       x.sound1();
       y.sound1();
    }
}

