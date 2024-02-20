package com.Array;

public class Multi_Array {
	
	public static void main(String[] args) {
		int a[][] = {
				{1,3,5},{1,2,3},{2,4,6}
		};
		System.out.println(a.length);
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]+"");
		}
		System.out.println();
		
	}	
	}

}
