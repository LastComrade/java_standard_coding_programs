package com.deloitte.programs;

public class _10_Count2sInNumber {
	public static void main(String[] args) {
		_10_Count2sInNumber obj = new _10_Count2sInNumber();
		System.out.println(obj.solve(1321323232));
		System.out.println(obj.solve(-3435));
		System.out.println(obj.solve(9990006070605454L));
	}

	// O(N)
	private int solve(long number) {
		int result = 0;
		number = (number < 0 ? number * -1 : number); // For negative integers
		
		while (number > 0) {
			result += (number % 10 == 2 ? 1 : 0);
			number /= 10;
		}
		
		return result;
	}
}
