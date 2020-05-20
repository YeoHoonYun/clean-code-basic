package movies.oop;
import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = sc.next();
		if(command.equals("명예의전당")) {
			Movie.GetAllMovies().stream()
				.filter(movie -> movie.getBoxOffice().equals("S"))
				.forEach(System.out::println);
		} else {
			System.out.println(Movie.GetMovie(command));
		}
		sc.close();
	}
}
