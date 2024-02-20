package com.Exceptions;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=s.nextInt();
		
		
		if (a>=50) {
			System.out.println(a+"is greater");		
		}
		s.close();
		
		
		
		
	}

}
