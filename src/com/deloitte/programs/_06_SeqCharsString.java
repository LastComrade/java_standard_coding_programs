package com.deloitte.programs;

import java.util.ArrayList;
import java.util.List;

public class _06_SeqCharsString {
	public static void main(String[] args) {
		_06_SeqCharsString obj = new _06_SeqCharsString();

		for (char c : obj.solve("Is the river flowing rapidly?")) {
			System.out.print(c + " ");
		}
	}

	// O(N)
	private List<Character> solve(String s) {
		List<Character> result = new ArrayList<Character>();
		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < i + 1) {
				// If the ith character is not attainable then return the last character of the word
				result.add(words[i].charAt(words[i].length() - 1));
			} else {
				result.add(words[i].charAt(i));
			}
		}

		return result;
	}
}
