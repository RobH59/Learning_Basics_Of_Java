
public class Token {
    private String type;
    private int value;
    
    Token(String startType, int startValue) {
        type = startType;
        value = startValue;
    }
    
    void print() {
        System.out.println("Type is:" + type + " and value is: " + value);
    }
}
