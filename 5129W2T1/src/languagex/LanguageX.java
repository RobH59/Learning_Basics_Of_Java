package languagex;

import java.io.IOException;

public class LanguageX {

    public static final int MAX_NUM_TOKENS = 2000; // You may assume there will be no more than 2000 tokens
    public static Token[] tokenSequence = new Token[MAX_NUM_TOKENS];
    public static int currentToken=0;
    
    public static void main(String[] args) {
        LexAnalyser lex = new LexAnalyser();
        Token nextToken = new Token(TokenType.END_OF_LINE);
        do {
            try {
                nextToken = lex.scan();
                tokenSequence[currentToken] = nextToken;
                currentToken++;
            }
            catch(IOException ex) {
                System.out.println("Syntax Error");
            }
        } while(nextToken.returnType() != TokenType.END_OF_FILE);
    }
}
