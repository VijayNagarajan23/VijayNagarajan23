package inheritance.com;

public class Child extends Parent{
	
	private void child() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
	public static void main(String[] args) {
		Child abc = new Child();
		abc.parentA();
		abc.parentB();
		abc.child();
	}

}
