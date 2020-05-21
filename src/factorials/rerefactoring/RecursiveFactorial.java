package factorials.rerefactoring;

public class RecursiveFactorial implements Factorial {
    @Override
    public long factorial(int num) {
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }
}
