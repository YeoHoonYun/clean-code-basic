package factorials.original;

public class FactorialProgram {
	public static void main(String[] args) {
		int number = 25;


//		NanoTime nanoTime = new NanoTime();
//		NanoTime nanoTime1 = new NanoTime();

//		nanoTime.setStart(System.nanoTime());
//		long result = interativeFactorial(number);
//		nanoTime.setStop(System.nanoTime());
//
//		System.out.println(result);
//		System.out.println(nanoTime.timeDit());
//		System.out.println(timeDit("I",number));

		System.out.println("------------------------------------");
//		nanoTime1.setStart(System.nanoTime());
//		long result2 = factorial(number);
//		nanoTime1.setStop(System.nanoTime());
//
//		System.out.println(result2);
//		System.out.println(nanoTime1.timeDit());
//		System.out.println(timeDit("R",number));
	}

	private static long interativeFactorial(int number) {
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static long factorial(int number) {
		if (number == 1)
			return 1;
		return number * factorial(number - 1);
	}

	public static String timeDit(String t, int number){
		long startTime = System.nanoTime();
		if (t.equals("I")){
			System.out.println(interativeFactorial(number));
		}else if (t.equals("R")){
			System.out.println(factorial(number));
		}
		long endTime = System.nanoTime();
		return ( endTime - startTime ) + "ns";
	}
}
class NanoTime{
	private long start;
	private long stop;

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getStop() {
		return stop;
	}

	public void setStop(long stop) {
		this.stop = stop;
	}

	public String timeDit(){
		return ( this.stop - this.start ) + "ns";
	}
}