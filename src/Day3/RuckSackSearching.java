package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RuckSackSearching {
	public static void main(String args[]) {
		ArrayList<Character> SharedCompartments = new ArrayList<Character>();
		int finalAnswer =0;
		try {
			File SACK = new File("src/Day3/DayThreeInput.txt");
			Scanner s = new Scanner(SACK);

			while (s.hasNextLine()) {
				String currentSack = s.nextLine();
				String firstHalf = currentSack.substring(0, (currentSack.length()/2));
				String secondHalf = currentSack.substring((currentSack.length()/2), currentSack.length());
				fullLoop:
					for(int i=0; i<firstHalf.length(); i++) {
						char testingChar = firstHalf.charAt(i);
						for(int j=0; j<secondHalf.length(); j++) {
							char compChar = secondHalf.charAt(j);
							if(compChar == testingChar) {
								SharedCompartments.add(compChar);
								break fullLoop;
							}
						}
					}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for(int i=0; i<SharedCompartments.size(); i++) {
			int currentSharedComponent =(int) SharedCompartments.get(i);
			if(currentSharedComponent >= (int)'a') {
				currentSharedComponent -= 96;
			} else {
				currentSharedComponent -=38;
			}
			finalAnswer += currentSharedComponent;
			
		}
		System.out.println(finalAnswer);
	}
	
}
