package main.java.com.practice;

import main.java.com.methods.iterate;
import main.java.com.methods.stringprompt;

public class palindrome {

    public static void main(String[] args) {
        boolean ispalindrome = true;

        stringprompt sprompt = new stringprompt();
        iterate iterate = new iterate();

        String word;
        word = sprompt.prompt();
        char[] cword = word.toCharArray();

        ispalindrome = iterate.iterate(ispalindrome, word.length(), cword);


        if (ispalindrome) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
