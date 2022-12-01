package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FattestElfClean {
	static int FattestElf = 0;
	static int currentElf = 0;
	static int elfCount = 0;
	static int SecondFattestElf = 0;
	static int ThirdFattestElf = 0;
	public static void main(String[] args) {
		try {
			File ElvishCalories = new File("src/Day1/DayOneInput.txt");
			Scanner s = new Scanner(ElvishCalories);
			while (s.hasNextLine()) {
				String currentSnack = s.nextLine();
				if(currentSnack.length() == 0) {
					elfCount++;
					if(currentElf > FattestElf) {
						ThirdFattestElf = SecondFattestElf;
						SecondFattestElf = FattestElf;
						FattestElf = currentElf;

						System.out.println("Current biggest elf has " + FattestElf + " calories");
					}
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
		int threeBiggestTotal = FattestElf + SecondFattestElf + ThirdFattestElf;
		System.out.println("the biggest three elves have " + threeBiggestTotal + " combined calories");
	}

}