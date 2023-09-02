package com.deloitte.programs;

public class _03_CountWordChars {
	public static void main(String[] args) {
		_03_CountWordChars obj = new _03_CountWordChars();
		
		for (int count : obj.solve("Java String Methods Tutorial With Examples")) {
			System.out.print(count + " ");
		}
	}

	// O(N)
	private int[] solve(String string) {
		String[] words = string.split(" ");
		int[] result = new int[words.length];
		
		for (int i=0; i<words.length; i++) {
			result[i] = words[i].length();
		}
		
		return result;
	}
}
