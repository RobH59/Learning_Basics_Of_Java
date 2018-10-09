package languagex;

import java.io.IOException;

public class LexAnalyser {
    private char peek = ' '; // The next character of input to be considered

    public LexAnalyser() { // Default constructor

    }
    public Token scan() throws IOException {
        // Read characters until end of whitespace (spaces, tabs or newlines)
        for( ; ; peek = (char)System.in.read()) {
            if(peek == ' ' || peek == '\t' || peek=='\n' || peek== '\r') continue;
            else break;
        }
               
        // Is the next token a number? Check whether peek is a digit (from 0-9)
        if(Character.isDigit(peek)) { 
            int v = 0;
            do {
                v = 10*v + Character.digit(peek, 10);
                peek = (char)System.in.read();
            } while(Character.isDigit(peek));
            return new NumToken(v); // v stores the integer value of the token
        }
        
        // Otherwise, check if the next token is a valid identifier or keyword
        if(Character.isLetter(peek)) {
            StringBuffer b = new StringBuffer();
            do {
                b.append(peek);
                peek = (char)System.in.read();
            } while(Character.isLetterOrDigit(peek));
            String s = b.toString(); // s now stores the next lexeme as a string
            
            if(s.equals("int")) {
                // s represents an int keyword
                Token key = new Token(TokenType.INTEGER_KEYWORD);
                return key;
            }
            else {
                // If s was not the keyword int, it must be an identifier (name of a variable)
                IdentToken newIdentifier = new IdentToken(s);
                return newIdentifier;
            }
        }
             
        // Check if the next token an operator or end of line/end of file symbol
        switch(peek) {
            case('$'): peek = ' '; return new Token(TokenType.END_OF_FILE); 
            case(';'): peek = ' '; return new Token(TokenType.END_OF_LINE); 
            case('='): peek = ' '; return new Token(TokenType.EQUALS); 
            case('+'): peek = ' '; return new Token(TokenType.ADD); 
            case('-'): peek = ' '; return new Token(TokenType.SUBTRACT); 
        }
        //If we have gotten to here, we have not matched any token so print an error message and return a NULL_TOKEN
        System.out.println("Syntax Error");
        return new Token(TokenType.NULL_TOKEN); // Represents an error
    } 
}
