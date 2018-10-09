package languagex;

// Basic class for tokens, can be extended by subclasses for 
// identifiers (IdentToken) and for integers (NumToken) 
public class Token {
    private TokenType thisToken;
    
    // Default constructor will create a NULL Token
    public Token() {
        thisToken = TokenType.NULL_TOKEN;
    }
    
    // Constructor for a Token of a given TokenType
    public Token(TokenType inputToken) {
        thisToken = inputToken;
    }
    
    // Return the TokenType of this Token
    public TokenType returnType() {
        return thisToken;
    }
    
    public void print() {
        switch(thisToken) {
            case EQUALS: System.out.println("Equality Token"); break;
            case END_OF_FILE: System.out.println("END_OF_FILE Token"); break;
            case END_OF_LINE: System.out.println("END_OF_LINE Token"); break;
            case NULL_TOKEN: System.out.println("Null Token"); break;
            case INTEGER_KEYWORD: System.out.println("Integer Keyword Token"); break;
            case ADD : System.out.println("ADD op Token"); break;
            case SUBTRACT : System.out.println("SUBTRACT op Token"); break;
        }
    }
}