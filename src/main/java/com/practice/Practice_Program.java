package main.java.com.practice;

import main.java.com.methods.count;
import main.java.com.methods.iterate;
import main.java.com.methods.stringprompt;
import main.java.com.methods.reverse;

public class palindrome {

    public static void main(String[] args) {
        boolean ispalindrome = true;

        stringprompt sprompt = new stringprompt();
        reverse wreverse = new reverse();
        count countl = new count();
        iterate iterate = new iterate();

        String word;
        word = sprompt.prompt();
        char[] cword = word.toCharArray();

        //Palindrome Check Here
        ispalindrome = iterate.iterate(ispalindrome, word.length(), cword);

        //REVERSE HERE
        char[] reversed = wreverse.reverse(word.length(), cword);

        //COUNT HERE
        countl.count(word.length(),word);


        if (ispalindrome) {
            System.out.println("\nThis is a Palindrome");
        } else {
            System.out.println("\nThis is not a Palindrome");
        }
        System.out.println("\nReverse of word is: ");
        System.out.println(reversed);
    }
}
