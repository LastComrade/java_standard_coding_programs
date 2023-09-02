package com.deloitte.programs;

public class _04_GetNextChar {
	public static void main(String[] args) {
		_04_GetNextChar obj = new _04_GetNextChar();

		System.out.println(obj.solve("A String Array is an Array of a fixed number of String values"));
	}

	private String solve(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				result += (char) (s.charAt(i) + 1);
			} else {
				result += ' ';
			}
		}

		return result;
	}
}
