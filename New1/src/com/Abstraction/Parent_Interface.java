package com.Abstraction;

public interface Parent_Interface {
	
	void shape();
	
	void shape1();
	
	void shape2();
	
	public static void main(String[] args) {
		Parent_Interface obj =new Child();
		obj.shape();
		obj.shape1();
		obj.shape2();
	}

}
