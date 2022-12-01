package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FattestElfClean {
	static int currentElf = 0;
	static int elfCount = 0;
	static int[] elfCalories= new int[300];
	public static void main(String[] args) {
		try {
			File ElvishCalories = new File("src/Day1/DayOneInput.txt");
			Scanner s = new Scanner(ElvishCalories);
			while (s.hasNextLine()) {
				String currentSnack = s.nextLine();
				if(currentSnack.length() == 0) {
					elfCount++;
					elfCalories[elfCount] = currentElf;
					currentElf = 0;
				}
				else {
					currentElf += Integer.parseInt(currentSnack);
				}
			}
			s.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Arrays.sort(elfCalories);
		int FattestElf = elfCalories[299];
		int SecondFattestElf = elfCalories[298];
		int ThirdFattestElf = elfCalories[297];
		int threeBiggestTotal = FattestElf + SecondFattestElf + ThirdFattestElf;
		System.out.println("the elf with the most calories has " + FattestElf);
		System.out.println("the biggest three elves have " + threeBiggestTotal + " combined calories");
	}

}