package com.selection;

import java.util.Scanner;

public class Demo {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		//if statement
		int a = s.nextInt();
		if (a<=50) {
			System.out.println("Vijay");	
		}
		System.out.println("Enter the Number:");
		int b = s.nextInt();
		//if else statement
		if(b>100) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("Enter the number:");
		int c = s.nextInt();
		//if else if statement
		if(c>=20) {
			System.out.println("True");
		}else if (c==20) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		//Nested if Statement
		System.out.println("Enter the number");
		int d = s.nextInt();
		if (d<100) {
			if (d<=100) {
				System.out.println("Correct");
				
			}
			
		}
		
		s.close();
	}

}
