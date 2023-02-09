package com.valtech.hashmap;

import java.util.HashMap;
import java.util.Optional;

public class GFG {

	// Main method
	public static void main(String[] args) {

		// create a HashMap and add some values
		HashMap<String, String> map
				= new HashMap<>();
		map.put("key1", "salman");
		map.put("key2", "shah");
		map.put("key3", "aamir");
		map.put("key4", "lala");

		// print map details
		System.out.println("HashMap:\n "
				+ map.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
		map.computeIfAbsent("key5",
				k -> "amit");
		map.computeIfAbsent("key4",
				k -> "pala");

		// print new mapping
		System.out.println("New HashMap:\n "+map);
		String a=Optional.ofNullable(map.get("key45")).orElseGet(()->"45");
		System.out.println(a);
	}
}