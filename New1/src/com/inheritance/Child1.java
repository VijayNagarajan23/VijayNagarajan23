package com.inheritance;

public class Child1 implements Parent_1,Parent_2{

	@Override
	public void shape1() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
		
	}

	@Override
	public void shape2() {
		// TODO Auto-generated method stub
		System.out.println("Square");
		
	}

	@Override
	public void shape3() {
		// TODO Auto-generated method stub
	System.out.println("Triangle");	
		
	}

	@Override
	public void shape4() {
		// TODO Auto-generated method stub
	System.out.println("Rectangle");	
		
	}

	@Override
	public void shape5() {
		// TODO Auto-generated method stub
	System.out.println("Diamond");	
		
	}

	@Override
	public void shape6() {
		// TODO Auto-generated method stub
	System.out.println("Heart");
		
	}
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.shape1();
		obj.shape2();
		obj.shape3();
		obj.shape4();
		obj.shape5();
		obj.shape6();
	}

}
