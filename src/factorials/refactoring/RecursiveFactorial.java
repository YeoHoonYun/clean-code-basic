package factorials.refactoring;

public class RecursiveFactorial implements Factorial {
    @Override
    public long factorial(int number) {
        if (number == 1)
            return 1;
        return number * factorial(number - 1);
    }
}
