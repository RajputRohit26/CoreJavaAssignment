package com.assignment;

public class ConstructorOverloading {

	 int age;
	 String name;
	public ConstructorOverloading() {
       age=18;
       name="Rohit";
	}
	
	public ConstructorOverloading(int age,String name) {
     
		this.age=age;
		this.name=name;
	}
	
	void show()
	{
		System.out.println("Age: "+age +" Name: "+name);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading m1=new ConstructorOverloading();
		ConstructorOverloading m2=new ConstructorOverloading(20, "Rahul");
		
		m1.show();
		m2.show();
	}
}
