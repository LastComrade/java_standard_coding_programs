package com.deloitte.programs;

public class _11_MaxDigitFromNumber {
	public static void main(String[] args) {
		_11_MaxDigitFromNumber obj = new _11_MaxDigitFromNumber();

		System.out.println(obj.solve(1232332323));
		System.out.println(obj.solve(000000000));
		System.out.println(obj.solve(-123));
		System.out.println(obj.solve(99999999));
	}

	private int solve(int number) {
		int result = 0;
		number = number < 0 ? number * -1 : number;

		while (number > 0) {
			result = Math.max(result, number % 10);
			number /= 10;
		}

		return result;
	}
}
