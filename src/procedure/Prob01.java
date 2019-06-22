package procedure;
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String classRank = sc.next();
		int testScore = sc.nextInt();
		if(classRank.equals("A") && testScore >= 90) {
			System.out.println("Accept");
		} else if(classRank.equals("B") && testScore >= 80) {
			System.out.println("Accept");
		} else if(classRank.equals("C") && testScore >= 70) {
			System.out.println("Accept");
		} else {
			System.out.println("Reject");
		}
		sc.close();
	}
}
