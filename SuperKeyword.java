package com.assignment;


class A2
{
	A2()
	{
		System.out.println("A1's Constructor");
	}
	
	void show()
	{
		System.out.println("Show From A1");
	}
}
class B2 extends A2
{
	B2()
	{
		System.out.println("B1's Constructor");
	}
	
	void show()
	{
		super.show();
		System.out.println("Show From B1");
	}
}
class C2 extends B2
{
	C2()
	{
		System.out.println("C1's Constructor");
	}
	
	void show()
	{
		super.show();
		System.out.println("Show From C1");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		C2 c=new C2();
		c.show();
	}
}

