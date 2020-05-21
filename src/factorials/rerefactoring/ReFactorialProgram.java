package factorials.rerefactoring;

public class ReFactorialProgram {
    public static void main(String[] args) {
        FactorialObserver recursiveFactorial1 = new FactorialObserver(new InteractiveFactorial());
        FactorialObserver recursiveFactorial2 = new FactorialObserver(new RecursiveFactorial());

        recursiveFactorial1.Observer();
        recursiveFactorial2.Observer();
    }
}
