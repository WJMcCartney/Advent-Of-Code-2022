package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IDEngulfing {
	static int ID1s;
	static int ID1e;
	static int ID2s;
	static int ID2e;
	static int count =0;
	public static void main(String[] args) {

		try {
			File IDList = new File("src/Day4/DayFourInput.txt");
			Scanner s = new Scanner(IDList);

			while (s.hasNextLine()) {
				String currentIDPair = s.nextLine();
				System.out.println(currentIDPair);
					ID1s = Integer.parseInt(currentIDPair.substring(0, currentIDPair.indexOf('-')));
					System.out.println(ID1s);
					ID1e = Integer.parseInt(currentIDPair.substring(currentIDPair.indexOf('-')+1, currentIDPair.indexOf(',')));
					System.out.println(ID1e);
					ID2s = Integer.parseInt(currentIDPair.substring(currentIDPair.indexOf(',')+1, currentIDPair.indexOf('-', currentIDPair.length()/2)));
					System.out.println(ID2s);
					ID2e = Integer.parseInt(currentIDPair.substring(currentIDPair.indexOf('-', currentIDPair.length()/2)+1, currentIDPair.length()));
					System.out.println(ID2e);
					if(ID1s <= ID2s && ID1e >= ID2e) {
						count++;
					} else if(ID2s <= ID1s && ID2e >= ID1e) {
						count++;
					}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}

}
