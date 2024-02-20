package com.Exceptions;

public class Demo {
	
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=50;
		int d=0;
		 char g='a';
		int h=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Vijay");
		try {
			System.out.println(g/h);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(c / d);
		} finally {
			// TODO: handle finally clause
			System.out.println("Java");
		}
		
		
		
	}
	
	

}
