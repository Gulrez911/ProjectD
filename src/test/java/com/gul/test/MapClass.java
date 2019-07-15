package com.gul.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		ArrayList<String> carList = new ArrayList<String>();
		carList.add("toyota");
		carList.add("bmw");
		carList.add("honda");

		map.put("car", carList);

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("banana");

		map.put("fruit", fruitList);

		Iterator<Entry<String, ArrayList<String>>> itr = map.entrySet().iterator();
		 while(itr.hasNext()) 
		        { 
		             Entry<String, ArrayList<String>> entry = itr.next(); 
		             System.out.println("Key = " + entry.getKey() +  
		                                 ", Value = " + entry.getValue()); 
		        } 
		// for(String key:map.keySet()) {
//			        System.out.println("Keys: "+key);
//		        }

//		        for(ArrayList<String> key:map. values()) {
//			        System.out.println("Values: "+key);
//		        }
	}
}
