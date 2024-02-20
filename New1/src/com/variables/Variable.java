package com.variables;

public class Variable {
	 
	int b=60;
	static int c=80;
	//final int d=100;
	private void New() {
		// TODO Auto-generated method stub
		int a=40;
		a=50;
		int b=30;
		final int d=100;
		c=90;
		System.out.println(a+"=local variable");
		System.out.println(b);
		System.out.println(c+"=static variable");
		System.out.println(d+"=final variable");
	}
	public static void main(String[] args) {
		Variable v=new Variable();
		System.out.println(v.b);
		v.New();
		System.out.println(v.b+"=Class Variable");
	}
	
	
}
