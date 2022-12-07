package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RuckSackGroupSeaches {
	public static void main(String args[]) {
		ArrayList<Character> SharedCompartments = new ArrayList<Character>();
		ArrayList<Character> firstComparison = new ArrayList<Character>();
		String tempString1="";
		String tempString2="";
		String tempString3="";
		int finalAnswer =0;
		int count = 0;
		try {
			File SACK = new File("src/Day3/DayThreeInput.txt");
			Scanner s = new Scanner(SACK);

			while (s.hasNextLine()) {
				count++;
				switch(count % 3){
				case 1:
					tempString1 = s.nextLine();
					firstComparison.clear();
					break;
				case 2:
					tempString2 = s.nextLine();
						for(int i=0; i<tempString1.length(); i++) {
							char testingChar = tempString1.charAt(i);
							for(int j=0; j<tempString2.length(); j++) {
								char compChar = tempString2.charAt(j);
								if(compChar == testingChar) {
									firstComparison.add(compChar);
									break;
								}
							}
						}
					break;
				case 0:
					tempString3 = s.nextLine();
					Loop:
						for(int i=0; i<firstComparison.size(); i++) {
							char testingChar = firstComparison.get(i);
							for(int j=0; j<tempString3.length(); j++) {
								char compChar = tempString3.charAt(j);
								if(compChar == testingChar) {
									SharedCompartments.add(compChar);
									break Loop;
								}
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