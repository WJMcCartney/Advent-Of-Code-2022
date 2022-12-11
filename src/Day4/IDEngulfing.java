package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IDEngulfing {
	int ID1s;
	int ID1e;
	int ID2s;
	int ID2e;
	public static void main(String[] args) {

		try {
			File IDList = new File("src/Day4/DayFourInput.txt");
			Scanner s = new Scanner(IDList);
			while (s.hasNextLine()) {
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
