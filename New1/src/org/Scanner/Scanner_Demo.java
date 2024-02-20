package org.Scanner;

import java.util.Scanner;

public class Scanner_Demo {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Name");
		
		String a=s.next();
		System.out.println("Enter Surname");
		String b=s.next();
		System.out.println("Enter E-mail");
		String c=s.next();
		
		System.out.println("Confirm E-mail");
		String d=s.next();
		
		System.out.println("Password");
		String e=s.next();
		System.out.println("Confirm Password");
		String f=s.next();
		
		System.out.println("Enter Mobile Number");
		long g=s.nextLong();
		
		System.out.println("Enter Date of Birth");
		String h=s.next();
		
		System.out.println("Gender");
		String i=s.next();
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
				
		s.close();
	}			
}
