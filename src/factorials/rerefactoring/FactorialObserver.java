package factorials.rerefactoring;

public class FactorialObserver {
    Factorial factorial;

    public FactorialObserver(Factorial factorial) {
        this.factorial = factorial;
    }

    public void Observer(){
        long start = System.nanoTime();
        System.out.println(this.factorial);
        long end = System.nanoTime();
        System.out.println((end - start) + "ns");
    }
}
