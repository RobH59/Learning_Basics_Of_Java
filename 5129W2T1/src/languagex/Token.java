package languagex;

// Basic class for tokens, can be extended by subclasses for each particular token
public class Token {
    private TokenType thisToken;
    
    public Token() {
        thisToken = TokenType.NULL_TOKEN;
    }
    
    public Token(TokenType inputToken) {
        thisToken = inputToken;
    }
    
    public TokenType returnType() {
        return thisToken;
    }
}