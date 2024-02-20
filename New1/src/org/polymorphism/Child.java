package org.polymorphism;

public class Child extends Parent{
	
	@Override
	public void Studentname(String a) {
		// TODO Auto-generated method stub
		super.Studentname(a);
	}
	@Override
	public void StudentAge(int b) {
		// TODO Auto-generated method stub
		super.StudentAge(b);
	}
	@Override
	public void Gender(char a) {
		// TODO Auto-generated method stub
		super.Gender(a);
	}
	@Override
	public void Addressandpincode(String c, int b) {
		// TODO Auto-generated method stub
		super.Addressandpincode(c, b);
	}
	@Override
	public void StudentFees(String c, char d, int e) {
		// TODO Auto-generated method stub
		super.StudentFees(c, d, e);
	}
	@Override
	public void Fathernameandinitial(String d, char e, char f) {
		// TODO Auto-generated method stub
		super.Fathernameandinitial(d, e, f);
	}
	@Override
	public void StudentAccountNumber(long g) {
		// TODO Auto-generated method stub
		super.StudentAccountNumber(g);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.Studentname("John");
		c.StudentAge(17);
		c.Gender('M');
		c.Addressandpincode("Apostolic Christian Assembly Anna Nagar Chennai", 600101);
		c.StudentFees("Rs", '.', 65000);
		c.Fathernameandinitial("Michael", '.', 'S');
		c.StudentAccountNumber(50010101789612l);
		
		
		
	}
	
}
