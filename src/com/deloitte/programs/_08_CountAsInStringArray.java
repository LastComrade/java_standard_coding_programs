package com.deloitte.programs;

import java.util.ArrayList;
import java.util.List;

public class _08_CountAsInStringArray {
	public static void main(String[] args) {
		_08_CountAsInStringArray obj = new _08_CountAsInStringArray();

		for (int count : obj.solve(
				"An Array is an essential and most used data structure in Java. It is one of the most used data structure by programmers due to its efficient and productive nature; The Array is a collection of similar data type elements. It uses a contiguous memory location to store the elements.")) {
			System.out.print(count + " ");
		}
	}

	// O(N)
	private List<Integer> solve(String s) {
		List<Integer> result = new ArrayList<Integer>();
		String[] words = s.split(" ");
		
		for (String word : words) {
			int count = 0;
			
			for (int i=0; i<word.length(); i++) {
				if (word.charAt(i) == 'a') {
					count++;
				}
			}
			
			result.add(count);
		}
		
		return result;
	}
}
