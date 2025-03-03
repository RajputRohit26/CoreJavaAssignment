package com.assignment;

public class MethodOverloading {

	void display(int num)
	{
		System.out.println("Integer :"+num);
	}
	void display(double num)
	{
		System.out.println("Double :"+num);
	}
	void display(String text)
	{
		System.out.println("String :"+text);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.display(5);
		m.display(5.7);
		m.display("RAJPUT");
	}
}
