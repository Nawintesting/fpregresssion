package com.javamaps;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new LinkedHashMap();
		map.put(3, "chodisetty");
		map.put(1, "naveen");
		map.put(2, "Kumar");
		map.put(4, 1234);
		map.put(5, "chodisetty");
		System.out.println(map);
		Set s = map.keySet();
		System.out.println(s);
		
		
	}

}
