package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		
		Map<String, Integer> occCounter = new HashMap<>();
		
		for (String c : str.split(" ")) {
			
			if (occCounter.containsKey(c)) {
				
				occCounter.put(c, occCounter.get(c) + 1);
			} else {
				
				occCounter.put(c, 1);
			}
		}
		
		
		
		
		
		System.out.println(occCounter);
		System.out.println("---------------------");
		System.out.println("Second part");
		
		String newStrTest = str.replaceAll("[^a-zA-Z ]", "");
		String newStr = newStrTest.replaceAll("  ", " ");
		
		System.out.println(newStr);
		
		Map<String, Integer> occCounter2 = new HashMap<>();
		
		for (String c : newStr.split(" ")) {
			
			if (occCounter2.containsKey(c)) {
				
				occCounter2.put(c, occCounter2.get(c) + 1);
			} else {
				
				occCounter2.put(c, 1);
			}
		}
		
		System.out.println(occCounter2);
	}
}
