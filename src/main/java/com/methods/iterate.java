package main.java.com.methods;

public class iterate {

    public boolean iterate(boolean c, int s, char[] word)
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

}
