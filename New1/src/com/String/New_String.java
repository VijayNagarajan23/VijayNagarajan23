package com.String;



public class New_String {
	
	
	public static void main(String[] args) {
		
		
		String a="Amazon";
		for (int i = 0; i < a.length(); i++) {
			if(i<3) {
				System.out.print(a.charAt(i));
				}else {
					for (int j = a.length()-1; j >2; j--) {
						System.out.print(a.charAt(j));
					}
					break;
			}
			
		}
	}
} 	
