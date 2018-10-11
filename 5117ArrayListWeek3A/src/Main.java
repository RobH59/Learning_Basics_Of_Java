
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<Crime> crime = Data_Handling.readFile("Data\\crimedata-full-month.csv");
		Scanner scan = new Scanner(System.in);
		System.out.println("a. By Crime type (lexicographic order)\r\n"
				+ "b. By Last outcome category (again, lexicographic order)\r\n"
				+ "c. By LSOA Name (this is as presented in the file)" + "");
		String Menu = scan.nextLine();

		switch (Menu) {
		case "a":
			Data_Manipulation.crime_Lexicographic_order(crime);
			Data_Handling.outputCrimes(crime);
			break;

		case "b":
			Data_Manipulation.category_Lexicographic_order(crime);
			Data_Handling.outputCrimes(crime);
			break;

		case "c":
			Data_Manipulation.LSOA_Name(crime);
			Data_Handling.outputCrimes(crime);
			break;

		}
	}
}
