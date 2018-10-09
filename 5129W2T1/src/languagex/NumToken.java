package languagex;

/*  A NumToken is used to represent an integer number in Java, such as 321 */

public class NumToken extends Token {
    private int intValue;
    
    public NumToken(int value) {
        super(TokenType.NUM); // Call the constructor for the superclass (Token)
        intValue = value;
    }
    
    public int getValue() {
        return intValue;
    }
    
    public void print() {
        System.out.println("Number Token: " + intValue);
    }
}
