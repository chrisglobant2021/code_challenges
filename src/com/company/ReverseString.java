package com.company;

public class ReverseString {

    //Write a function that reverts a String without using the reverse method of it. And do it
    //without creating a new String.
    public static void main(String[] args) {

        String text = "christian";
        reverse(text);
    }

    private static void reverse(String text) {
        char[] try1 = text.toCharArray();
        text = "";
        for (int i = try1.length - 1; i >= 0; i--) {
            text += try1[i];
        }
        System.out.println(text);
    }
}
