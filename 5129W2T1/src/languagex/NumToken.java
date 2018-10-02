package languagex;

public class NumToken extends Token {
    private int intValue;
    
    public NumToken(int value) {
        super(TokenType.NUM);
        intValue = value;
    }
    
	// Write a get/set method and a print function for this class 
}
