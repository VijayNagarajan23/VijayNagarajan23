package com.selection;

import java.util.Scanner;

public class Discount {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your bill amount:");
		double  a= s.nextDouble();
		
		System.out.println("Rs."+a);
		
		double b=0.0;
		if(a >= 100) {
			b=10;
		}else {
			b=5;
		}
		double c=(b/100)*a;
		double d=a-b;
		
		System.out.println("Your Discount Amount: Rs."+c);
		System.out.println("Your Balance Amount:Rs."+d);
		
		System.out.println("Thank You Have A Nice Day!!!!");
		
		s.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
