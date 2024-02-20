package com.Constructor;


public class New {
	
	public New(int a) {//Parameterized Constructor
		// TODO Auto-generated constructor stub
		System.out.println(a);
	}
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	public static void main(String[] args) {
		New obj=new New(30);
		obj.Shape();
	}

}
