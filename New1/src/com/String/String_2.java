package com.String;


public class String_2 {
	
	public static void main(String[] args) {
		
		String s="Vijay";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));	
		}
		String s1=" Kumar ";
		for(int j=s1.length()-1;j >=0;j--) {
			System.out.print(s1.charAt(j));
		}
		String s2="Vijay Kumar";
		//System.out.println(s2);
		String[] split = s2.split("");
		System.out.println(split);
		//for (int i = split.length-1; i >=0; --i) {
			//System.out.print(s2.charAt(i));
		//}
		for (String i:split) {
			System.out.print(i);
		}
	}
}
