package languagex;

// This enum is used to define different types of tokens
public enum TokenType {
    NUM, // Token is a number
    ID, // token is an identifier
    INTEGER_KEYWORD, // token is a int keyword
    END_OF_FILE, // token represents the end of file
    END_OF_LINE, // token represents end of line character
    NULL_TOKEN, // Empty token (not representing a valid token)
    EQUALS, // token represents equals sign
}