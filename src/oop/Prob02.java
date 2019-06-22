package oop;
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
			HeroSchool school = new HeroSchool();
			String result = school.getHeroClass(classRank).testScore(testScore);
			System.out.println(result);
		}
		sc.close();
	}
}
