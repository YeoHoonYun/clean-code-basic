package movies.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTable {

	public static final Object[][] ROWS = {
		{"어벤져스", "판타지", "타노스", 1121},
		{"인사이드아웃", "애니메이션", "라일리", 496},
		{"엄복동", "드라마", "엄복동", 17},
		{"인터스텔라", "SF", "쿠퍼", 1030},
		{"과속스캔들", "코미디", "차태현", 800}
	};

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		for(Object[] ROW : ROWS){
			Movie movie = new Movie((String) ROW[0],(String) ROW[1],(String) ROW[2],(Integer) ROW[3]);
			movies.add(movie);
		}
		System.out.println((movies.toString()));

		for (Movie os : movies) {
			Integer num = os.getAudience();
			if (num >= 1000) {
				os.setDgree("S");
			} else if (num < 1000 & num >= 700) {
				os.setDgree("A");
			} else if (num < 700 & num >= 400) {
				os.setDgree("B");
			} else if (num < 400 & num >= 100) {
				os.setDgree("C");
			}else{
				os.setDgree("F");
			}
			System.out.println(os.toString());
		}

		String message;
		Scanner scan = new Scanner(System.in);
		message = scan.nextLine();

		if(!message.contains("명예의전당")) {
			System.out.println("제목 Title | 장르 Genre | 주인공 Hero | 관객수 Audience | 등급 Dgree");
			for (Movie os : movies) {
				if (message.contains(os.getTitle())) {
					System.out.println(os.getTitle() + " | " + os.getGenre() + " | " + os.getHero() + " | " + os.getAudience() + " | " + os.getDgree());
				}
			}
		}else{
			System.out.println("제목 Title | 장르 Genre | 주인공 Hero | 관객수 Audience | 등급 Dgree");
			for (Movie os : movies) {
				if (os.getDgree().contains("S")) {
					System.out.println(os.getTitle() + " | " + os.getGenre() + " | " + os.getHero() + " | " + os.getAudience() + " | " + os.getDgree());
				}
			}
		}
	}
}

class Movie{
	private String title;
	private String Genre;
	private String hero;
	private Integer audience;
	private String dgree;

	public Movie(String title, String genre, String hero, Integer audience) {
		this.title = title;
		this.Genre = genre;
		this.hero = hero;
		this.audience = audience;
	}

	public Movie(String title, String genre, String hero, Integer audience, String dgree) {
		this.title = title;
		Genre = genre;
		this.hero = hero;
		this.audience = audience;
		this.dgree = dgree;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return Genre;
	}

	public String getHero() {
		return hero;
	}

	public Integer getAudience() {
		return audience;
	}

	public String getDgree() {
		return dgree;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public void setAudience(Integer audience) {
		this.audience = audience;
	}

	public void setDgree(String dgree) {
		this.dgree = dgree;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", Genre='" + Genre + '\'' +
				", hero='" + hero + '\'' +
				", audience=" + audience +
				", dgree='" + dgree + '\'' +
				'}';
	}
}