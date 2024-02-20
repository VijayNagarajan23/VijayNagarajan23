package org.polymorphism;

public class Method_Overloading {
	
	private void Studentname(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	private void StudentAge(int b) {
		// TODO Auto-generated method stub
		System.out.println(b);
	}
	private void Gender(char a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	private void Addressandpincode(String c,int b) {
		// TODO Auto-generated method stub
		System.out.println(c+b);
	}
	private void StudentFees(String c,char d,int e) {
		// TODO Auto-generated method stub
		System.out.println(c+d+e);
	}
	private void Fathernameandinitial(String d,char e,char f) {
		// TODO Auto-generated method stub
		System.out.println(d+e+f);
	}
	private void StudentAccountNumber(long g) {
		// TODO Auto-generated method stub
		System.out.println(g);
	}
	
	public static void main(String[] args) {
		Method_Overloading obj=new Method_Overloading();
		obj.Studentname("John");
		obj.StudentAge(17);
		obj.Gender('M');
		obj.Addressandpincode("W-110,Apostolic Christian Assembly Anna Nagar Chennai", 600101);
		obj.StudentFees("Rs", '.', 60000);
		obj.Fathernameandinitial("Michael", '.', 'S');
		obj.StudentAccountNumber(50010101722462l);
		
	}
}
