package com.deloitte.programs;

public class _05_RemoveXsAppendAtLast {
	public static void main(String[] args) {
		_05_RemoveXsAppendAtLast obj = new _05_RemoveXsAppendAtLast();

		System.out.println(obj.solve("asdkasdasdxxxx xxcsdsXXXXsdXXXsxxxxxxx........xxxasdasodin iasd24 23 23jxxxXXxxx*"));
	}

	// O(N)
	private String solve(String s) {
		String result = "";
		String xString = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'x') {
				result += s.charAt(i);
			} else {
				xString += s.charAt(i);
			}
		}

		return result + xString;
	}
}
