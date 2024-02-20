package inheritance.com;

public class Multilevel3 extends Multilevel2{
	
	private void shape6() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}
	private void shape7() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	public void shape8() {
		// TODO Auto-generated method stub
		System.out.println("Cone");
	}
	public static void main(String[] args) {
		Multilevel3 obj =new Multilevel3();
		obj.shape1();
		obj.shape2();
		obj.shape3();
		obj.shape4();
		obj.shape5();
		obj.shape6();
		obj.shape7();
		obj.shape8();
	}

}
