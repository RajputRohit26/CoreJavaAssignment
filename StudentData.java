package com.assignment;

public class StudentData {

	 int age;
	    String name;
		public StudentData(String name,int age) {
			this.name=name;
	        this.age=age;
			
		}
		void show() {
			System.out.println(" Name: "+name+ " Age: "+age );
			
		}
		
		public static void main(String[] args) {
			 StudentData c=new  StudentData("Rohit",20);
			 c.show();
		}
		
}
