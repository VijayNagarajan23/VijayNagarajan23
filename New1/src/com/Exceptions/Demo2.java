package com.Exceptions;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = 100;
		try {
			a = s.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);
		s.close();
		
	}

}
