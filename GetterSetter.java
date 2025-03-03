package com.assignment;

public class GetterSetter {

	private double balance;
	private String holder;
	
	public GetterSetter(double balance,String holder)
	{
		this.balance=balance;
		this.holder=holder;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	 void display() {
	        System.out.println("Account Holder: " + holder + ", Balance: " + balance);
	    }
	public static void main(String[] args) {
		GetterSetter g=new GetterSetter(20000, "Rohit");
		g.display();
		g.setBalance(12000);
		System.out.println("Updating Balance is  "+g.getBalance());
		 	
	}


}
