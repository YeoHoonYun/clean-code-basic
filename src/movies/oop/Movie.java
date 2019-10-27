package movies.oop;

import java.util.ArrayList;
import java.util.List;

import movies.db.MovieTable;

public class Movie {
	private String title, genre, hero;
	private int audience;
	
	public static Movie GetMovie(String title) {
		for (int i = 0; i < MovieTable.ROWS.length; i++) {
			Object[] row = MovieTable.ROWS[i];
			if(title.equals(row[0])) {
				Movie movie = new Movie();
				movie.setTitle(title);
				movie.setGenre((String)row[1]);
				movie.setHero((String)row[2]);
				movie.setAudience((int)row[3]);
				return movie;
			}
		}
		return null;
	}
	
	public static List<Movie> GetAllMovies() {
		List<Movie> movies = new ArrayList<>();
		for (int i = 0; i < MovieTable.ROWS.length; i++) {
			Object[] row = MovieTable.ROWS[i];
			Movie movie = new Movie();
			movie.setTitle((String)row[0]);
			movie.setGenre((String)row[1]);
			movie.setHero((String)row[2]);
			movie.setAudience((int)row[3]);
			movies.add(movie);
		}
		return movies;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public int getAudience() {
		return audience;
	}
	public void setAudience(int audience) {
		this.audience = audience;
	}
	
	@Override
	public String toString() {
		return String.format("제목: %s, 장르: %s, 주인공: %s, 관객수: %s만, 흥행등급: %s", title, genre, hero, audience, getBoxOffice());
	}
	
	public String getBoxOffice() {
		if(audience >= 1000)
			return "S";
		else if(audience >= 700)
			return "A";
		else if(audience >= 400)
			return "B";
		else if(audience >= 100)
			return "C";
		else
			return "F";
	}
}
