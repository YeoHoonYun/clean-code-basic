package movies.procedure;
import java.util.Scanner;

import movies.db.MovieTable;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = sc.next();
		if(command.equals("명예의전당")) {
			for (int i = 0; i < MovieTable.ROWS.length; i++) {
				Object[] row = MovieTable.ROWS[i];
				String boxOffice = getBoxOffice((int)row[3]);
				if(boxOffice.equals("S")) {
					System.out.printf("제목: %s, 장르: %s, 주인공: %s, 관객수: %s만, 흥행등급: %s\n", row[0], row[1], row[2], row[3], boxOffice);
				}
			}
		}else {
			for (int i = 0; i < MovieTable.ROWS.length; i++) {
				Object[] row = MovieTable.ROWS[i];
				if(row[0].equals(command)) {
					String boxOffice = getBoxOffice((int)row[3]);
					System.out.printf("제목: %s, 장르: %s, 주인공: %s, 관객수: %s만, 흥행등급: %s", row[0], row[1], row[2], row[3], boxOffice);
				}
			}
		}
		sc.close();
	}
	
	private static String getBoxOffice(int audience) {
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
