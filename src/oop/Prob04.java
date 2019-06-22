package oop;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String classRank = sc.next();
		HeroSchool school = new HeroSchool();
		HeroClass heroClass = school.getHeroClass(classRank);
		System.out.println(heroClass.getTeacher() + " - " + heroClass.getCutLine());
		sc.close();
	}
}
