package com.assignment;

import java.util.Scanner;

public class MaximunNo {

	static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
	
	public static void main(String[] args) {
		int a,b,c;
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter First Number : ");
	        a = sc.nextInt();
	        System.out.print("Enter Second Number :");
	        b = sc.nextInt();
	        System.out.print("Enter third Number :");
	        c = sc.nextInt();
	        System.out.println("Maximum No : " + findMax(a, b, c));
	}
}
