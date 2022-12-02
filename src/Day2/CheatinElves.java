package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheatinElves {
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
				} else if(currentValue.equals("BX")) {
					valueCount[1]++;
				} else if(currentValue.equals("CX")) {
					valueCount[2]++;
				} else if(currentValue.equals("AY")) {
					valueCount[3]++;
				} else if(currentValue.equals("BY")) {
					valueCount[4]++;
				} else if(currentValue.equals("CY")) {
					valueCount[5]++;
				} else if(currentValue.equals("AZ")) {
					valueCount[6]++;
				} else if(currentValue.equals("BZ")) {
					valueCount[7]++;
				} else if(currentValue.equals("CZ")) {
					valueCount[8]++;
				}
				
			}
			finalCount += (4 * valueCount[0]);
			finalCount += (1 * valueCount[1]);
			finalCount += (7 * valueCount[2]);
			finalCount += (8 * valueCount[3]);
			finalCount += (5 * valueCount[4]);
			finalCount += (2 * valueCount[5]);
			finalCount += (3 * valueCount[6]);
			finalCount += (9 * valueCount[7]);
			finalCount += (6 * valueCount[8]);
			System.out.println(finalCount);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
