package procedure;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String classRank = sc.next();
		if(classRank.equals("A")) {
			System.out.println("캡틴 아메리카 - 90");
		} else if(classRank.equals("B")) {
			System.out.println("토르 - 80");
		} else if(classRank.equals("C")) {
			System.out.println("블랙팬서 - 70");
		}
		sc.close();
	}
}
