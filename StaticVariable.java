package com.assignment;

public class StaticVariable {

	static int x=10;
	static void update(int y)
	{
		x=y;
	}
	
	static void show()
	{
		System.out.println("Value of x:"+x);
	}
	public static void main(String[] args) {
	    StaticVariable.show();
	    System.out.println("Updated Value");
	    StaticVariable.update(12);
	    StaticVariable.show();
	}
}
