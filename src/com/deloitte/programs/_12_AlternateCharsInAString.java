package com.deloitte.programs;

public class _12_AlternateCharsInAString {
	public static void main(String[] args) {
		_12_AlternateCharsInAString obj = new _12_AlternateCharsInAString();

		System.out.println(obj.solve("HeyEveryoneMyNameIsKonark"));
	}

	private String solve(String s) {
		String oddResult = "";
		String evenResult = "";

		// Characters at odd indexed positions
		for (int i = 1; i < s.length(); i += 2) {
			oddResult += s.charAt(i);
		}

		// Characters at even indexed positions
		for (int i = 0; i < s.length(); i += 2) {
			evenResult += s.charAt(i);
		}

		return oddResult + " " + evenResult;
	}
}
