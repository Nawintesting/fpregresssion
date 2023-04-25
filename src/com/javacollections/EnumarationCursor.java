package com.javacollections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumarationCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Vector vector = new Vector();
		 vector.add("java");
		 vector.add("selenium");
		 vector.add("phython");
		 vector.add("selenium");
		 vector.add("java");
		 vector.add(".net");
		 System.out.println(vector);
		 
		 //Enumerations only for java 1.0 Legacy Classes - Vector,Stack,Dictonary,Properties
		Enumeration enum1 = vector.elements();
		while(enum1.hasMoreElements()) {
			System.out.println(enum1.nextElement())	;
		}
			
		
		
		
		
	}

}
