package com.deloitte.programs;

public class _07_NumberValidation {
	public static void main(String[] args) {
		_07_NumberValidation obj = new _07_NumberValidation();

		System.out.println(obj.solve1("22232343"));
		System.out.println(obj.solve1("22232343.23"));
		System.out.println(obj.solve1("22232343.23a"));
		System.out.println(obj.solve1("22232343.2.23"));
		System.out.println(obj.solve1("22232343s"));
		System.out.println(obj.solve1("sdfsdf"));
		System.out.println(obj.solve1(""));
		System.out.println(obj.solve1("____*^*&^%&"));
		System.out.println(obj.solve1("    "));
		
		System.out.println("***TRY-CATCH***");
		
		System.out.println(obj.solve2("22232343"));
		System.out.println(obj.solve2("22232343.23"));
		System.out.println(obj.solve2("22232343.23a"));
		System.out.println(obj.solve2("22232343.2.23"));
		System.out.println(obj.solve2("22232343s"));
		System.out.println(obj.solve2("sdfsdf"));
		System.out.println(obj.solve2(""));
		System.out.println(obj.solve2("____*^*&^%&"));
		System.out.println(obj.solve2("    "));
	}

	// O(N)
	private boolean solve1(String s) {
		// By iterating over the string characters and checking if they are a numerical
		// character or now
		boolean isDecimal = false;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) <= '0' || s.charAt(i) >= '9') {
				if (!isDecimal && s.charAt(i) == '.') {
					isDecimal = true;
				} else {
					return false;
				}
			}
		}

		return s.length() > 0 && true;
	}

	// O(N), seems like O(1) but the in-built method (parseInt) take linear time i.e O(N)
	private boolean solve2(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e1) {
			try {
				Double.parseDouble(s);
				return true;
			} catch (Exception e2) {
				return false;
			}
		}
	}
}
