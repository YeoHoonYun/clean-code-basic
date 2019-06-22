import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ScoreWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("score.txt"));
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		String[] ranks = {"A", "B", "C"};
		for (int i = 0; i < 100; i++) {
			String rank = ranks[rand.nextInt(3)];
			int score = rand.nextInt(50) + 50;
			sb.append(rank + " " + score + "\r\n");
		}
		fw.write(sb.toString());
		fw.close();

	}

}
