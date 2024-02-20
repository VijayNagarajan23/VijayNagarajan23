package org.New_program;


public class New1 {
	
	
	//with Return type 
	String shape() {
		
		return "Triangle";
	}
	int number() {
		
		return 40;
	}
	//without return type
	void shape1() {
		System.out.println("Square");
	}
	//main method
	public static void main(String[] args) {
		New1 n=new New1();
		String s = n.shape();
		System.out.println(s);
		n.shape1();
		int n1 = n.number();
		System.out.println(n1);
		
		
	}

}
