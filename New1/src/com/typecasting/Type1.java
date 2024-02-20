package com.typecasting;

public class Type1 {
	
	//Narrowing
	public static void main(String[] args) {
		long a=8752365210l;
		int b=(int) a;
		double c=44.26;
		int d=(int) c;
		System.out.println(b);
		System.out.println(d);
		System.out.println(b+d);
	}

}
