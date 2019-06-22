package oop;

public class HeroSchool {

	private HeroClass[] heroClasses = new HeroClass[] { 
			new HeroClass("A", "캡틴 아메리카", 90),
			new HeroClass("B", "토르", 80),
			new HeroClass("C", "블랙팬서", 70) };

	public HeroClass getHeroClass(String rank) {
		if (rank.equals("A")) {
			return heroClasses[0];
		} else if (rank.equals("B")) {
			return heroClasses[1];
		} else if (rank.equals("C")) {
			return heroClasses[2];
		}
		return null;
	}
}
