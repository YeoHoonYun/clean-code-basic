package oop;
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String classRank = sc.next();
		int testScore = sc.nextInt();
		HeroSchool school = new HeroSchool();
		String result = school.getHeroClass(classRank).testScore(testScore);
		System.out.println(result);
		sc.close();
	}
}
