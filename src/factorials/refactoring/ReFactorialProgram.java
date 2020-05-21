package factorials.refactoring;

public class ReFactorialProgram {
    public static void main(String[] args) {
        FactorialObserver observer1 = new FactorialObserver(new InterativeFactorial());
        FactorialObserver observer2 = new FactorialObserver(new RecursiveFactorial());

        observer1.observe(25);
        observer2.observe(25);
    }
}
