package factorials.refactoring;

public class FactorialObserver {
    private Factorial factorial;

    public FactorialObserver(Factorial factorial) {
        this.factorial = factorial;
    }

    public void observe(int number){
        long base = System.nanoTime();
        long result = factorial.factorial(number);
        System.out.println((System.nanoTime() - base ) + "ns");
        System.out.println(result);
    }
}
