import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Data_Handling {
	
	public static ArrayList<Crime> readFile(String filename) throws FileNotFoundException {
		ArrayList<Crime> crimes = new ArrayList<>();
		File csvFile = new File(filename);
		Scanner csvScan = new Scanner(csvFile);

		csvScan.nextLine(); // read header
		while (csvScan.hasNextLine()) {
			String line = csvScan.nextLine();
			Crime crime = new Crime(line);
			crimes.add(crime);
		}

		csvScan.close();
		return crimes;
	}

	static void outputCrimes(ArrayList<Crime> crime) {
		int underInvestigation = 0, other = 0, unsolved = 0;
		for (int i = 0; i < crime.size(); i++) {
			Crime currentCrime = crime.get(i);
			if (currentCrime != null) {
				if (currentCrime.outcome.startsWith("Under invest"))
					underInvestigation++;
				else if (currentCrime.outcome.startsWith("Investigation complete; no"))
					unsolved++;
				else
					other++;

				System.out.println(currentCrime.crimeid + ": (" + currentCrime.crimetype + ") " + currentCrime.location
						+ " --> " + currentCrime.outcome);
			}
		}
		System.out.println("There are " + crime.size() + " recorded crimes; ");
		System.out.println(
				underInvestigation + " are under investigation - " + percent(underInvestigation, crime.size()));
		System.out.println(unsolved + " have been investigated, but are unsolved - " + percent(unsolved, crime.size()));
		System.out.println(other + " other -" + percent(other, crime.size()));
	}

	private static String percent(int num, int div) {
		double perc = ((double) num / div);
		perc *= 100;
		return String.format(" %.1f%%", perc);
	}

}
