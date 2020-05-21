package factorials.rerefactoring;

public class InteractiveFactorial implements Factorial {
    @Override
    public long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
