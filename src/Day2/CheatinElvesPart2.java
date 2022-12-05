package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheatinElvesPart2 {
	static int finalCount;
	public static void main(String[] args) {
		int valueCount[] = new int[9];
		try {
		File RPSInputs = new File("src/Day2/DayTwoInput.txt");
		Scanner s = new Scanner(RPSInputs);

			while(s.hasNextLine()) {
				String currentValue = s.nextLine();
				currentValue = currentValue.replaceAll("\\s", "");
				if(currentValue.equals("AX")) {
					valueCount[0]++;
				} else if(currentValue.equals("AY")) {
					valueCount[1]++;
				} else if(currentValue.equals("AZ")) {
					valueCount[2]++;
				} else if(currentValue.equals("BX")) {
					valueCount[3]++;
				} else if(currentValue.equals("BY")) {
					valueCount[4]++;
				} else if(currentValue.equals("BZ")) {
					valueCount[5]++;
				} else if(currentValue.equals("CX")) {
					valueCount[6]++;
				} else if(currentValue.equals("CY")) {
					valueCount[7]++;
				} else if(currentValue.equals("CZ")) {
					valueCount[8]++;
				}
				
			}
			System.out.println(finalCount);
			// a rock b paper c scissors
			finalCount += ((3+0) * valueCount[0]);//Scissors L
			finalCount += ((1+3) * valueCount[1]);//Rock D
			finalCount += ((2+6) * valueCount[2]);//Paper W
			finalCount += ((1+0) * valueCount[3]);//Rock L
			finalCount += ((2+3) * valueCount[4]);//Paper D
			finalCount += ((3+6) * valueCount[5]);//Scissors W
			finalCount += ((2+0) * valueCount[6]);//Paper L
			finalCount += ((3+3) * valueCount[7]);//Scissors D
			finalCount += ((1+6) * valueCount[8]);//Rock W
			System.out.println(finalCount);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}