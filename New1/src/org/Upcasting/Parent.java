package org.Upcasting;

public class Parent {
	
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	public void shape1() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	public void shape2() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
	}
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.shape();
		obj.shape1();
		obj.shape2();
	}
	
}
