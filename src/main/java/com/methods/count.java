package main.java.com.methods;

public class count {

    public void count(int s, String str)
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
}
