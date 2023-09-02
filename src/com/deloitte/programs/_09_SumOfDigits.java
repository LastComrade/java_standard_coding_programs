package com.deloitte.programs;

public class _09_SumOfDigits {
	public static void main(String[] args) {
		_09_SumOfDigits obj = new _09_SumOfDigits();

		System.out.println(obj.solveForInt(22133));
		System.out.println(obj.solveForLong(221331232323L));
	}

	// O(N)
	private int solveForLong(long number) {
		int result = 0;

		while (number > 0) {
			result += (number % 10);
			number /= 10;
		}

		return result;
	}

	// O(N)
	private int solveForInt(int number) {
		int result = 0;

		String numberString = Integer.toString(number);

		for (int i = 0; i < numberString.length(); i++) {
			result += (numberString.charAt(i) - '0');
		}

		return result;
	}
}
