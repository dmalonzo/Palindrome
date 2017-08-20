package main.java.com.methods;

public class reverse {

    public char[] reverse(int n, char[] c)
    {
        char[] rev = new char[n];
        for (int i = 0; i< n; i++)
        {
            rev[i] = c[n-1-i];
        }
        return rev;
    }

}
