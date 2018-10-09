package languagex;

/*  TokenType is an enum, or enumeration
    An enum type is a special data type that enables for a variable to be a 
    set of predefined constants. The variable must be equal to one of the 
    values that have been predefined for it. */
public enum TokenType {
    NUM, // Token is a number (has its own Token class, called NumToken)
    ID, // token is an identifier (has its own Token class, called IdentToken)
    INTEGER_KEYWORD, // token is a int keyword
    END_OF_FILE, // token represents the end of file
    END_OF_LINE, // token represents end of line character
    NULL_TOKEN, // Empty token (not representing a valid token)
    EQUALS, // token represents equals sign
    ADD,
    SUBTRACT
}