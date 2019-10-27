package factorials.calculators;

import factorials.Factorial;

public class AFactorial implements Factorial{

	@Override
	public long calculate(int number) {
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result - 1;
	}
}
