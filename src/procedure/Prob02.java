package procedure;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream(new File("score.txt")));
		while(sc.hasNextLine()) {
			String[] splited = sc.nextLine().split(" ");
			String classRank = splited[0];
			int testScore = Integer.parseInt(splited[1]);
			if(classRank.equals("A") && testScore >= 90) {
				System.out.println("Accept");
			} else if(classRank.equals("B") && testScore >= 80) {
				System.out.println("Accept");
			} else if(classRank.equals("C") && testScore >= 70) {
				System.out.println("Accept");
			} else {
				System.out.println("Reject");
			}
		}
		sc.close();
	}
}
