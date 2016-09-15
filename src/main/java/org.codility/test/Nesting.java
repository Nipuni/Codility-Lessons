package org.codility.test;
/*

 */

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * User: Nipuni Perera
 *
 */
public class Nesting {

    public static void main(String []args) {
        System.out.println(solution("())"));
    }

    public static int solution(String S) {
        char[] characters = S.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        try{
            for(int index=0; index< characters.length; index++) {
                if(characters[index]==')') {
                    stack.pop();
                } else if(characters[index]=='(') {
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
}
