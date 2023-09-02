package com.deloitte.programs;

public class CountWordChars_03 {
	public static void main(String[] args) {
		CountWordChars_03 obj = new CountWordChars_03();
		
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
