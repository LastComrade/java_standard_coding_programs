package com.deloitte.programs;

public class _14_WeirdProblem {
	public static void main(String[] args) {
		_14_WeirdProblem obj = new _14_WeirdProblem();

		System.out.println(obj.solve("hell0o/world"));
	}

	// O(N)
	private String solve(String s) {
		String[] words = s.split("/");

		if (words[0].length() == words[1].length()) {
			return Integer.toString(words[0].length());
		} else if (words[0].length() > words[1].length()) {
			return words[0];
		}

		return words[1];
	}
}
