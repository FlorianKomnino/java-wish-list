package org.lessons.java.christmas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Set<Integer> rndNums = new HashSet<>();
		
		Random rnd = new Random();
		
		while (rndNums.size() < 5) {
			int intToAdd = rnd.nextInt(2, 13);
				rndNums.add(intToAdd);
		}
		
		System.out.println(rndNums);
	}
}
