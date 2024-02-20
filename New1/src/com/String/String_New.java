package com.String;



public class String_New {
	
	public static void main(String[] args) {
		String s="Vijay";
		System.out.println(s);
		int length = s.length();
		System.out.println(length);
		int index = s.length()-1;
		System.out.println(index);
		String st="vijay";
		boolean equals = s.equals(st);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(st);
		System.out.println(equalsIgnoreCase);
		String upperCase = st.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		char charAt = s.charAt(4);
		System.out.println(charAt);
		int indexOf = st.indexOf('y');
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf('a')-1;
		System.out.println(lastIndexOf);
	
		
		 String b="";
		
		for (int i = s.length()-1; i >=0; i--) {
			if (i<=5) {
			
				b+=s.charAt(i);
				System.out.println(b);
			}
//			b+=s.charAt(i);
//			System.out.println(b);
			
		}
		
	}
	
	

}
