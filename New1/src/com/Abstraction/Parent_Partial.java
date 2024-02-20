package com.Abstraction;

public abstract class Parent_Partial {
	
	public void shape1() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	public void shape2() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	public abstract void shape3();
	
	public abstract void shape4();
	
	public static void main(String[] args) {
		Parent_Partial obj=new Child_Partial();
		obj.shape1();
		obj.shape2();
		obj.shape3();
		obj.shape4();
		
	}
}
