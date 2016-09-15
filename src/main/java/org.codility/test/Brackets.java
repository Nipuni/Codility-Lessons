package org.codility.test;
/*
 * Copyright (c) 2016, Denis Weerasiri All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
