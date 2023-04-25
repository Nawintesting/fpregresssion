package com.javamaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put(1, "value");
		map.put(2,"selenium");
		map.put(null, null);
		map.put(null, ".net");
		map.put(3, "   ");
		map.put(4,null);
		map.put("name", "naveen");
		map.put(123, 345);
		System.out.println(map);
		
		int size = map.size();
		System.out.println("Size is "+size);
		
		
		Set keyset = map.keySet();
		System.out.println(keyset);
		
		
		Object obj = map.get("name");
		System.out.println(obj);
		
		System.out.println(map.getClass());
		
		boolean objvalue = map.containsValue(obj);
		System.out.println(objvalue);
		
		
		Set entry = map.entrySet();
		System.out.println(entry);
		
		Collection col = map.values();
		System.out.println(col);
		
	}

}
