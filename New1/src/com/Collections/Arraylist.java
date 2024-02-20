package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		
		List<Object> obj=new ArrayList<Object>();
		
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(600);
		obj.add(2, 800);
		int size = obj.size();
		int indexOf = obj.indexOf(400);
		int lastIndexOf = obj.lastIndexOf(300);
		int lastIndexOf2 = obj.lastIndexOf(null);
		boolean contains = obj.contains(400);
		Object object = obj.get(4);
		Object set = obj.set(3, 700);
		boolean empty = obj.isEmpty();
		
		List<Object> obbj=new LinkedList<Object>();
		obbj.add(10);
		obbj.add(200);
		obbj.add(30);
		obbj.add(400);
		obbj.add(50);
		obj.addAll(obbj);
		System.out.println(obj);
		obbj.remove(4);
		System.out.println(obbj);
		obbj.removeAll(obj);
		obj.retainAll(obbj);
		
			
		System.out.println(empty);
		System.out.println(set);
		System.out.println(object);
		System.out.println(contains);
		System.out.println(lastIndexOf2);
		System.out.println(lastIndexOf);
		System.out.println(indexOf);
		System.out.println(obj);
		System.out.println(size);
		
	}

}
