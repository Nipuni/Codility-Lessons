package org.codility.test;


import java.util.EmptyStackException;
import java.util.Stack;

/**
 * User: Nipuni Perera
 *
 */
public class Brackets {

    public static void main (String [] args) {
        System.out.println(solution("(]"));
    }

    public static int solution(String S) {
        char[] characters = S.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        try{
            for(int index=0; index< characters.length; index++) {
                if(characters[index]==')' || characters[index]==']' || characters[index]=='}') {
                    if(checkCharacter(stack,characters[index])) {
                        stack.pop();
                    } else {
                        return 0;
                    }

                } else if(characters[index]=='(' || characters[index]=='[' || characters[index]=='{') {
                    stack.push(characters[index]);
                }
            }
        } catch (EmptyStackException emptyStackException) {
            return 0;
        }

        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean checkCharacter(Stack<Character> stack, char closingBracket) {
        if(stack.peek()==getOpeningBracket(closingBracket)){
            return true;
        } else {
            return false;
        }
    }

    public static char getOpeningBracket(char closingBracket) {
        if(closingBracket==')'){
            return '(';
        } else if(closingBracket==']'){
            return '[';
        } else {
            return '{';
        }
    }
}
