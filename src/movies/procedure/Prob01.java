package movies.procedure;
import java.util.Scanner;

import movies.db.MovieTable;

public class Prob01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		for (int i = 0; i < MovieTable.ROWS.length; i++) {
			Object[] row = MovieTable.ROWS[i];
			if(row[0].equals(title)) {
				System.out.printf("제목: %s, 장르: %s, 주인공: %s, 관객수: %s만", row[0], row[1], row[2], row[3]);
			}
		}
		sc.close();
	}
}
