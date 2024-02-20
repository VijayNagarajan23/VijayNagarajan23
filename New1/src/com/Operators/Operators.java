package com.Operators;

public class Operators {
	//Arithmetic Operator
		public static void main(String[] args) {
			int a=70;
			int b=60;
			boolean x = true;
			boolean y = false;
			System.out.println("Arithmetic Operator:");
			//Addition
			System.out.println(a+b);
			//Subtraction
			System.out.println(a-b);
			//Multiplication
			System.out.println(a*b);
			//Division
			System.out.println(a/b);
			//Modulus
			System.out.println(a%b);
			
		//Unary Operator
			System.out.println("Unary:");
			System.out.println("PostIncrement:" +(a++));//a=70
			System.out.println("PreIncrement:"+(++a));//a=70+1=71,a=71+1=72
			System.out.println("PostDecrement:"+(a--));
			System.out.println("PreDecrement:"+(--a));//a=72-1=71,a=71-1=70
			System.out.println(a!=b);
			
		//Assignment Operator
			System.out.println("Assignment:");
		    System.out.println(a += 40);//a=70+40=110
			System.out.println(b -= 50);//b=60-50=10
			System.out.println(a *= 2);//a=110*2=220
			System.out.println(b %= 3);//b=10%3=1(Remainder)
			System.out.println(a /= 5);//a=220/5=44(Quotient)
			
			
		//Relational Operator
			System.out.println("Relational:");
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a>b);
			System.out.println(a<b);
			System.out.println(a>=b);
			System.out.println(a<=b);
			
			
		//Bitwise Operator
			System.out.println("Bitwise:");
			System.out.println(a|b);
			System.out.println(a^b);
			System.out.println(a);
			System.out.println(b);
		//Logical Operator
			System.out.println("Logical:");
		if (a>b) {
			System.out.println(x&&y);	
		}
		else {
			System.out.println(x||y);
		}
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!y);
		
		//shift Operator
		System.out.println("Shift:");
		System.out.println(a << 2);
		System.out.println(b >> 1);
		System.out.println(a);
		System.out.println(b);
		
		}
		
	

}
