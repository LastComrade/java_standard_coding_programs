package com.deloitte.programs;

public class ReplaceFirstLastChar_02 {
	public static void main(String[] args) {
		ReplaceFirstLastChar_02 obj = new ReplaceFirstLastChar_02();
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
