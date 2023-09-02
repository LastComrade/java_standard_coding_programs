package com.deloitte.programs;

public class _13_CountTheLastChar {
	public static void main(String[] args) {
		_13_CountTheLastChar obj = new _13_CountTheLastChar();

		System.out.println(obj.solve("HeyEveryoneMyNamekkkkkIsKonark"));
	}

	private int solve(String s) {
		int result = 0;
		char key = s.charAt(s.length() - 1);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == key) {
				result++;
			}
		}

		return result;
	}
}
