package languagex;

/* An IdentToken represents an identifier token, i.e. the name of a variable */

public class IdentToken extends Token {
    private String identifierName; // The name of the lexeme represented by this token
    private int value;
    
    public IdentToken(String identName) {
        super(TokenType.ID); // Call the constructor for the superclass (Token)
        identifierName = identName;
        value = 0;
    }

    public String getIdName() {
        return identifierName;
    }
    
    public void setValue(int newValue) {
        value = newValue;
    }
    
    public int getValue() {
        return value;
    }
    
    public void print() {
        System.out.println("Identifier Token: " + identifierName);
    }
}
