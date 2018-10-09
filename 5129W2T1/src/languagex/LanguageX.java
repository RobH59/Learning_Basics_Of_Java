package languagex;

import java.io.IOException;

public class LanguageX {

    public static final int MAX_NUM_TOKENS = 3000; // You may assume there will be no more than 3000 tokens
    public static Token[] tokenSequence = new Token[MAX_NUM_TOKENS]; // tokenSequence is an array of tokens
    public static int currentToken=0;
    
    public static void main(String[] args) {
        LexAnalyser lex = new LexAnalyser(); // Create a LexAnalyser object
        Token nextToken = new Token(TokenType.NULL_TOKEN); // Initialise a new Token
        do {
            try {
                nextToken = lex.scan(); // Scan the next Token from the console input
                tokenSequence[currentToken] = nextToken; // Update the Token stored in the array tokenSequence
                currentToken++; // Increment the array counter
            }
            catch(IOException ex) {
                System.out.println("Error");
            }
        } while(nextToken.returnType() != TokenType.END_OF_FILE && nextToken.returnType() != TokenType.NULL_TOKEN); // Keep going until we see an end of file symbol
        if (nextToken.returnType() == TokenType.END_OF_FILE) {        
            System.out.println("Lexical Analysis Successful with " + currentToken + " tokens");
        }
        
        for(Token tokenInstance : tokenSequence) {
        	if(tokenInstance != null)
        		tokenInstance.print();
        }
        
    }
}
