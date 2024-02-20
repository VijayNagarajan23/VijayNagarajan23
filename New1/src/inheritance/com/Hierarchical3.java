package inheritance.com;

public class Hierarchical3 extends Hierarchical{
	private void plane() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane");
	}
	private void Ship() {
		// TODO Auto-generated method stub
		System.out.println("Cruise");
	}
	public static void main(String[] args) {
		Hierarchical3 obj = new Hierarchical3();
		obj.bicycle();
		obj.bike();
		obj.car();
		obj.plane();
		obj.Ship();
	}

}
