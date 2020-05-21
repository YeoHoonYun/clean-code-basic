package factorials.refactoring;

public class InterativeFactorial implements Factorial {
    @Override
    public long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
