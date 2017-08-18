package main.java.com.methods;

import java.util.Scanner;

public class stringprompt {

    public String prompt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a word: ");
        String word = scanner.nextLine();
        return word;
    }

}
