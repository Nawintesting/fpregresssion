package com.javacollections;

import java.awt.List;
import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {

		//By using for each loop get the values into arrays
		
		String[] str = {"java","selenium",".net","devops","workday","java"};
		
		for(String str1:str){
			
			if(str1.equalsIgnoreCase("java")){
					System.out.println("equal");
			}
			System.out.println(str1);
		}
		System.out.println("__________________________________");
		
		
		//By using for each loop get the values into collection object

		java.util.List list = new ArrayList();
		
		list.add(123);
		list.add(234);
		list.add(345);
		list.add(567);
		list.add(678);
		list.add(123);
		
		for(Object obj:list) {
			Integer i=(Integer) obj;
			if(i.equals(123)) {
				System.out.println("equal");
			}
			System.out.println(i);
		}
		
		
		
		
			
	}

}
