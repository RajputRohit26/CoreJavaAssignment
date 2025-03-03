package com.assignment;


	
	class person{
		String Name;
		double no;
		
		 person(String Na,double n)
		{
			Name=Na;
			no=n;
		}
		
		void display() {
			System.out.println("Name:"+Name+" Number:"+no);
		}
	}
	public class ParaMeterizedConstructor {
	 
		public static void main(String[] args) {
			person p=new person("Rohit",13.22);
			p.display();
		}

}
