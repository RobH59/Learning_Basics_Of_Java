package languagex;

import java.io.IOException;

public class LexAnalyser {
    private char peek = ' '; // The next character of input to be considered

    public LexAnalyser() {

    }
	
	// This next method should identify the next token from the user input, create a token for it and return that token
	// You should write the code for this function during the practical
    public Token scan() throws IOException {
        // Read characters until end of whitespace (spaces, tabs or newlines)
               
        // Determine if the next token is a number
        
        // Otherwise, determine if the next token is a valid identifier or keyword
             
        // Is the next token an operator or end of line/file?

        //If we have gotten to here, we have not matched any token so print an error message and return a NULL_TOKEN
        System.out.println("ERROR");
        return new Token(TokenType.NULL_TOKEN);
    } 
}
