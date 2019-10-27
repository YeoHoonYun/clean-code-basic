package factorials.apps;

import factorials.calculators.IterativeFactorial;
import factorials.calculators.RecursiveFactorial;

public class App {
	public static void main(String[] args) {
		int number = 25;
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		IterativeFactorial iterativeFactorial = new IterativeFactorial();
		
		long current = System.nanoTime();
		long result = recursiveFactorial.calculate(number);
		long exeTime = System.nanoTime() - current;
		System.out.println(result + " " + exeTime + "ns");
		
		current = System.nanoTime();
		result = iterativeFactorial.calculate(number);
		exeTime = System.nanoTime() - current;
		System.out.println(result + " " + exeTime + "ns");
	}
}
