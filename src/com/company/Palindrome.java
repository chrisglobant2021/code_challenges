package com.company;

public class Palindrome {

    //Write a function that validates that a String is a Palindrome. Try to do it without creating a
    //new string.

    public static void main(String[] args) {
        String text = "reconocer";
        System.out.println(validatePalindrome(text));
    }

    private static boolean validatePalindrome(String text) {
        char[] carry = text.toCharArray();
        int j = 0;
        for (int i = carry.length -1; i >= 0 && j < text.length() ; i--) {
            if(carry[i] != text.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
