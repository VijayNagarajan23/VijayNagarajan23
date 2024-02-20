package org.Scanner;

import java.util.Scanner;

public class Scanner_New {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Studentname");
		
		String a=s.nextLine();
		
		System.out.println("Enter Age");
		
		String b=s.nextLine();
		
		System.out.println("Enter Gender");
		
		String c=s.nextLine();
		
        System.out.println("Enter FatherName");
		
		String d=s.nextLine();
		
		 System.out.println("Enter Address");
			
		 String e=s.nextLine();
		 
		 System.out.println("Enter City");
		
		 String f=s.next();
		 
		System.out.println("Pincode");
		
		long g=s.nextLong();
		
		System.out.println("Enter Fees");
		
		double h=s.nextDouble();
		
		System.out.println("Enter Account number");
		
		Long i=s.nextLong();		
		
		System.out.println("Name:"+a);
	    System.out.println("Age:"+b);
		System.out.println("Gender:"+c);
		System.out.println("Father Name:"+d);
		System.out.println("Address:"+e);
		System.out.println("City:"+f);
		System.out.println("Pincode:"+g);
		System.out.println("Fees:"+h+"/-");
		System.out.println("Account Number:"+i);
		
		s.close();
		
		
	}

}
