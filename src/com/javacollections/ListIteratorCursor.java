package com.javacollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		list.add(0, "java");
		list.add(1, "selenium");
		list.add(2, "phyton");
		list.add(3, "selenium");
		list.add(4, "java");
		list.add(5, ".net");
		
		System.out.println(list);
		
		//ListIterator is only for List not suits for other collection object
		ListIterator litr = list.listIterator();
		while(litr.hasNext()) {
			
		Object obj =litr.next();
		String str = (String) obj;
		if(str.equalsIgnoreCase("selenium")) {
			System.out.println("    sop equal");
		}
		System.out.println(str);	
		
			
		}
		
		
	}

}
