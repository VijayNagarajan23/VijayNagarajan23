package inheritance.com;

public class Hierarchical2 extends Hierarchical{
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking");
	}
	public static void main(String[] args) {
		Hierarchical2 obj = new Hierarchical2();
		obj.bicycle();
		obj.bike();
		obj.walk();
		obj.car();
	}
	
	

}
