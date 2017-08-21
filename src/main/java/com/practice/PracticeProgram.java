package main.java.com.practice;
import java.util.Scanner;

public class PracticeProgram {

    private void Count(int s, String str)
    {
        //alphabet array
        String lower = str.toLowerCase();
        char[] ch = lower.toCharArray();
        int size = 26;
        char[] alpha = new char[size];
        int[] tally = new int[size];
        for(int i=0; i<size; i++)
        {
            alpha[i] = (char)(97+i);
            tally[i] = 0;
        }

        for (int i=0; i<s; i++)
        {
            for(int j=0; j<size; j++)
            {
                if(ch[i] == alpha[j])
                {
                    tally[j]++;
                }
            }
        }

        int ucount=0;
        for(int i=0; i<size;i++)
        {
            if(tally[i] > 0)
            {
                ucount++;
            }
        }

        char[] uarr = new char[ucount];
        int[] tallyshort = new int[ucount];
        int iter=0;
        for(int i=0; i<size; i++)
        {
            if(tally[i] > 0)
            {
                tallyshort[iter] = tally[i];
                uarr[iter] = alpha[i];
                iter++;
            }
        }

        System.out.println("\n Letter Count: ");
        for(int i=0;i<ucount;i++)
            System.out.println(uarr[i]+": "+tallyshort[i]);



    }

    private char[] Reverse(int n, char[] c)
    {
        char[] rev = new char[n];
        for (int i = 0; i< n; i++)
        {
            rev[i] = c[n-1-i];
        }
        return rev;
    }


    private String Prompt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a word: ");
        String word = scanner.nextLine();
        return word;
    }


    private boolean Iterate(boolean c, int s, char[] word)
    {
        for(int i = 0; i < s; i++)
        {
            if ( word[i] != word[s-1-i])
            {
                c = false;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        boolean isPalindrome = true;

        PracticeProgram practice = new PracticeProgram();


        String word;
        word = practice.Prompt();
        char[] cword = word.toCharArray();

        //Palindrome Check Here
        isPalindrome = practice.Iterate(isPalindrome, word.length(), cword);

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
