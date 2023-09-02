package com.deloitte.programs;

public class _02_ReplaceFirstLastChar {
	public static void main(String[] args) {
		_02_ReplaceFirstLastChar obj = new _02_ReplaceFirstLastChar();
		System.out.println(obj.solve("Konark Lohat"));
	}

	// O(N)
	private String solve(String s) {
		String result = "";
		result += s.charAt(s.length() - 1);

		for (int i = 1; i < s.length() - 1; i++) {
			result += s.charAt(i);
		}
		
		result += s.charAt(0);

		return result;
	}
}
