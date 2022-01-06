package com.company;

import java.util.Stack;

public class RoundCurly {

    //Write a function that validates a String.
    //Given a string of round, curly, and square open and closing brackets, return whether the
    //brackets are balanced (well-formed).
    //For example, given the string "([])[]({})", you should return true.
    //Given the string "([)]" or "((()", you should return false.

    public static void main(String[] args) {
        String input = "((()";
        System.out.println(checkIfBalanced(input,'{', '}')&&checkIfBalanced(input,'[', ']')&&checkIfBalanced(input,'(', ')'));
    }



    public static boolean checkIfBalanced(String input, char opening, char closing){
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < input.length();i++){
            char c = input.charAt(i);
            if(c == closing){
                if(!stack.empty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(c == opening){
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }
}
