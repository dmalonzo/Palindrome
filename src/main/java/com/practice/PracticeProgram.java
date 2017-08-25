package main.java.com.practice;
import java.util.HashMap;
import java.util.Scanner;

public class PracticeProgram {

    public void Count(int s, String str)
    {
        HashMap<Character, Integer> cCount = new HashMap<Character, Integer>(str.length());
        String lower = str.toLowerCase();
        char[] cArr = lower.toCharArray();

        for(int i=0; i<str.length(); i++)
        {
            if(cCount.containsKey(cArr[i]))
            {
                cCount.put(cArr[i], cCount.get(cArr[i])+1);
            }else{
                cCount.put(cArr[i], 1);
            }
        }

        for(Character key:cCount.keySet())
        {
            System.out.println(key+"= "+cCount.get(key));
        }
    }

    public char[] Reverse(int n, char[] c)
    {
        char tmp;
        for (int i = 0; i< n/2; i++)
        {
            tmp = c[i];
            c[i] = c[n-1-i];
            c[n-1-i] = tmp;
        }
        return c;
    }


    public String Prompt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a word: ");
        String word = scanner.nextLine();
        return word;
    }


    public boolean Iterate(int s, char[] word)
    {
        for(int i = 0; i < s; i++)
        {
            if ( word[i] != word[s-1-i])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        boolean isPalindrome = true;

        PracticeProgram practice = new PracticeProgram();


        String word;
        word = practice.Prompt();
        char[] cword = word.toCharArray();

        //Palindrome Check Here
        isPalindrome = practice.Iterate(word.length(), cword);

        //REVERSE HERE
        char[] reversed = practice.Reverse(word.length(), cword);

        //COUNT HERE
        practice.Count(word.length(),word);


        if (isPalindrome) {
            System.out.println("\nThis is a Palindrome");
        } else {
            System.out.println("\nThis is not a Palindrome");
        }
        System.out.println("\nReverse of word is: ");
        System.out.println(reversed);
    }
}
