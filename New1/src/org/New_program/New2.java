package org.New_program;

public class New2 {
	//Without Return Type
	public void user() {
		// TODO Auto-generated method stub
		System.out.println(30);
	}
	//With Return Type
	 int user2() {
		// TODO Auto-generated method stub
		 return 40;
	}
	//Main Method
	public static void main(String[] args) {
		
		System.out.println(20);
		int age=20;
		System.out.println(age+10);
		New2 n=new New2();
		n.user();
		int user2 = n.user2();
		System.out.println(user2+10);
		
	}

}
