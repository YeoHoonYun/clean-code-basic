package factorials;

public class FactorialObserver {
	private Factorial factorial;

	public FactorialObserver(Factorial factorial) {
		super();
		this.factorial = factorial;
	}
	
	public void observe(int number) {
		long current = System.nanoTime();
		long result = factorial.calculate(number);
		long exeTime = System.nanoTime() - current;
		System.out.println(result + " " + exeTime + "ns");
	}
}
