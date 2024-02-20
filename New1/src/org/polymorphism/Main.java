package org.polymorphism;

public class Main {
	public static void main(String a) {
		System.out.println("Hello");
		System.out.println(a);
	}
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String a,char b,char c) {
		System.out.println(a+b+c);
	}
	public static void main(char a) {
		System.out.println(a);
	}
	public static void main(int a, long l) {
		System.out.println(a+l);
	}
	public static void main(String[] args) {
		Main.main("John");
		Main.main('*');
		Main.main(40, 70);
		Main.main("Vijay",'.','N');
		Main.main(70, 6700420326143l);
	}

}
