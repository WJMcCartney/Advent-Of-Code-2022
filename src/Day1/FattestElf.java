package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FattestElf {
	static int FattestElf = 0;
	static int currentElf = 0;
	static int elfCount = 0;
	static int caughtElf =0;
	static int SecondFattestElf = 0;
	static int ThirdFattestElf = 0;
	static int FattestElfLocation;
	static int SecondFattestElfLocation = 0;
	static int ThirdFattestElfLocation = 0;
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
					if(currentElf > FattestElf) {
						caughtElf++;
						switch(caughtElf) {
							case 1: System.out.println("Patrol Elf: We found one with alot of calories worth of snacks! maybe this guy with " + currentElf + " calories worth of snacks which is the most we have found so far but we will keep looking!");
							break;
							
							case 2: System.out.println("Patrol Elf: We found another one! this one has " + currentElf + " calories worth of snacks and he has got to have the most out of anyone here!");
							break;
							
							case 3: System.out.println("Patrol Elf: Sir! We found this one who's got " + currentElf + " calories worth of snacks! We should have checked him first because he is known to steal food from the cafeteria!");
							break;
							
							case 4: System.out.println("Patrol Elf: Look over here! This one was hiding some under his shirt and in total he has " + currentElf + " calories worth of snacks! This has gotta be the elf with the most snacks!");
							break;
							
							case 5: System.out.println("Patrol Elf: Sir we found this elf with " + currentElf + " calories worth of snacks most! He was trying to his behind numbers 84 and 85! He has the most snacks out of anyone here!");
							break;
						}
						ThirdFattestElf = SecondFattestElf;
						SecondFattestElf = FattestElf;
						FattestElf = currentElf;
						ThirdFattestElfLocation = SecondFattestElfLocation;
						SecondFattestElfLocation = FattestElfLocation;
						FattestElfLocation = elfCount;
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
		Arrays.sort(elfCalories);
		int FattestElf = elfCalories[299];
		int SecondFattestElf = elfCalories[298];
		int ThirdFattestElf = elfCalories[297];
		int threeBiggestTotal = FattestElf + SecondFattestElf + ThirdFattestElf;
		System.out.println("the elf with the most calories has " + FattestElf);
		System.out.println("the biggest three elves have " + threeBiggestTotal + " combined calories");
		int finalValue = FattestElf + SecondFattestElf + ThirdFattestElf;
		System.out.println("Patrol Elf: All the elves have been checked which means we have finally come to the conclusion that elf number " + FattestElfLocation + " had the most snacks clocking in at " + FattestElf + " calories worth of snacks!");
		System.out.println("            For our little elf bodies thats like a lifetimes worth of food!");
		System.out.println("Santa: HO HO HO and HE HE HE HAW! Good job on finding the elf with the most food!");
		System.out.println("Patrol Elf: I dont think we should forget about " + SecondFattestElfLocation + " and " + ThirdFattestElfLocation +  " who both had alot of snacks");
		System.out.println("            The three of them in total had " + finalValue + " worth of calories combined! Santa, That is enough to feed you for an entire year!");
		System.out.println("Santa: Yes yes, we will put them down for the back up snacks don't you worry little one.");
	}

}
