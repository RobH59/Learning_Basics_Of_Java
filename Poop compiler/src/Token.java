/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CMPPBELL
 */
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
