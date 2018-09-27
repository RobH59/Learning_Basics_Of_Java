
import java.io.*;
import java.util.Scanner;

public class ABParser {
    public static void main(String[] args) {
        char next_character;
        Token[] arrayTokens = new Token[100]; // Could also use an ArrayList for dynamically sized array
        int arrayPosition = 0;
        System.out.print("Input source string:");
    	Scanner reader = new Scanner(System.in); 
    	String firstLine = reader.next();
    	for(int position = 0; position < firstLine.length(); position++) { 
            if(firstLine.charAt(position) == 'A' || firstLine.charAt(position) == 'B') {
                position++;
                if(Character.isDigit(firstLine.charAt(position))) {
                    int val = Character.getNumericValue(firstLine.charAt(position));
                    Token newToken = new Token(Character.toString(firstLine.charAt(position-1)), val);
                    arrayTokens[arrayPosition] = newToken;
                    arrayPosition++;
                }
                else {
                    System.out.print("Syntax Error: Digit Expected");
                }    
            }
            else {
                System.out.print("Syntax Error: A or B Expected");
            }         
        }
    	reader.close();
        
        for(int i = 0; i< arrayPosition; i++) {
           arrayTokens[i].print();
        }
    }    
}
