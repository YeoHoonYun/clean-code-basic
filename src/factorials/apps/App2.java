package factorials.apps;

import factorials.FactorialObserver;
import factorials.calculators.IterativeFactorial;
import factorials.calculators.RecursiveFactorial;

public class App2 {
	public static void main(String[] args) {
		int number = 25;
		new FactorialObserver(new RecursiveFactorial()).observe(number);
		new FactorialObserver(new IterativeFactorial()).observe(number);
	}
}
