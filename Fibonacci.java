package com.assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n,fr=0,se=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		 n=sc.nextInt();
		
		 for(int i=3;i<=n;i++)
		 {
			 int next=fr+se;
			 System.out.print(" "+next);
			 fr=se;
			 se=next;
		 }
	}
}
