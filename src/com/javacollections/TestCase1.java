package com.javacollections;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class TestCase1 {

	public static void main(String[] args) {
		
		
		String[] str = {"java","java","selenium","test","selenium","Array"};
		
		//Remove the dupilcate elements & ascending order in an string array
		HashSet hs =  new HashSet();
		/*for(int i=0;i<str.length;i++) {
			hs.add(str[i]);
		}
		System.out.println(hs);*/
		
		//duplicate elemts in array
		
		java.util.List listdup = new ArrayList();
		
		for(int i=0;i<str.length;i++){
			listdup.add(str[i]);
		}
		System.out.println(listdup);
		
		//print boolean value 
		for(int i=0;i<str.length;i++) {
			System.out.println(hs.add(str[i]));
		}
		System.out.println(hs);
		
		
		
		
		
	}
}
