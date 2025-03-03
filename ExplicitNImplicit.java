package com.assignment;

public class ExplicitNImplicit {

	
public static void main(String[] args) {
		
		int num = 5;
        double doubleNum = num;
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        double pi = 7.5;
        int intPi = (int) pi;
        System.out.println("Explicit Casting (double to int): " + intPi);
	}
}
