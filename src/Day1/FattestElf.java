package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FattestElf {
	int FattestElf;

	public static void main(String[] args) {
		try {
			File ElvishCalories = new File("DayOneInput.txt");
			Scanner s = new Scanner(ElvishCalories);
			while (s.hasNextLine()) {
				int currentElf = s.nextInt();
				System.out.println(currentElf);
			}
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
