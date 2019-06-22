package oop;

public class HeroClass {

	private String rank;
	private String teacher;
	private int cutLine;

	public HeroClass(String rank, String teacher, int cutLine) {
		this.rank = rank;
		this.teacher = teacher;
		this.cutLine = cutLine;
	}

	public int getCutLine() {
		return cutLine;
	}

	public void setCutLine(int cutLine) {
		this.cutLine = cutLine;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String testScore(int score) {
		return score >= cutLine ? "Accept" : "Reject";
	}
}
