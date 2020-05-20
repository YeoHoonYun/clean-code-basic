package movies.oop;
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		System.out.println(Movie.GetMovie(title));
		sc.close();
	}
}
