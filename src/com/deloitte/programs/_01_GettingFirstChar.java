package com.deloitte.programs;

import java.util.ArrayList;
import java.util.List;

public class _01_GettingFirstChar {
	
	// O(N)
	private List<Character> solve(String s) {
		List<Character> result = new ArrayList<>();
		String[] words = s.split(" ");
		
		// Assuming words are alphanumeric values
		for (String word : words) {
			if (Character.toLowerCase(word.charAt(0)) >= 'a' && Character.toLowerCase(word.charAt(0)) <= 'z') {
				result.add(word.charAt(0));
			} else if (Character.toLowerCase(word.charAt(0)) >= '0' && Character.toLowerCase(word.charAt(0)) <= '9') {
				result.add(word.charAt(0));
			}
		}		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		_01_GettingFirstChar obj = new _01_GettingFirstChar();
		
		for (char c : obj.solve("Wherever you go, you can always find good people . 022012 asd")) {
			System.out.print(c + " ");
		}
	}
}
