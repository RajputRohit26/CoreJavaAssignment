package com.assignment;



interface Gateway1{
    void processPayment(double amount);
}

class Pay implements Gateway1 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Gateway {

	public static void main(String[] args) {
		Pay payment = new Pay();
        payment.processPayment(250.75);
	}
}

