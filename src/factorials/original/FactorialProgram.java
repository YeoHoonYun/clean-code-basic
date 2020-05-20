package factorials.original;

public class FactorialProgram {
	public static void main(String[] args) {
		int number = 25;
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		System.out.println(result);

		long result2 = factorial(number);
		System.out.println(result2);
	}

	public static long factorial(int number) {
		if (number == 1)
			return 1;
		return number * factorial(number - 1);
	}
}
