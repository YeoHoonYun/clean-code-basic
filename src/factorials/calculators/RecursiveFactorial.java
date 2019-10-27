package factorials.calculators;

import factorials.Factorial;

public class RecursiveFactorial implements Factorial{

	@Override
	public long calculate(int number) {
		if(number == 1)
			return 1;
		return number * calculate(number - 1);
	}
}
